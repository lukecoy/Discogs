package com.lukecoy.discogs.data;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import org.skife.jdbi.v2.DBI;

public class DaoFactory<SqlObjectType> implements Provider<SqlObjectType> {

  private final DBI jdbi;
  private final TypeLiteral<SqlObjectType> typeLiteral = new TypeLiteral<SqlObjectType>(){};

  @Inject
  public DaoFactory(DBI jdbi) {
    this.jdbi = jdbi;
  }

  public SqlObjectType get() {
    return (SqlObjectType) jdbi.onDemand(typeLiteral.getRawType());
  }

}
