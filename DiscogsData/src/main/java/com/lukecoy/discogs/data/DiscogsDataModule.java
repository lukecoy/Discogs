package com.lukecoy.discogs.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.hubspot.rosetta.Rosetta;
import com.hubspot.rosetta.jdbi.RosettaMapperFactory;
import com.lukecoy.discogs.data.dao.ArtistDao;
import com.lukecoy.discogs.data.naming.LowercaseWithUnderscoresDBNamingStrategyModule;
import com.lukecoy.dropwizardbase.config.DropwizardBaseConfiguration;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class DiscogsDataModule extends AbstractModule {

  @Override
  protected void configure() {
    Rosetta.addModule(new LowercaseWithUnderscoresDBNamingStrategyModule());

    // Bind DAOs to Providers
    bind(ArtistDao.class).toProvider(new TypeLiteral<DaoFactory<ArtistDao>>(){});
  }

  @Provides
  public DBI provideDBI(DropwizardBaseConfiguration configuration, Environment env) {
    final DBI jdbi = new DBIFactory().build(env, configuration.getDataSourceFactory(), "postgresql");
    jdbi.registerMapper(new RosettaMapperFactory());
    return jdbi;
  }

}
