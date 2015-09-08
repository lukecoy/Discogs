package com.lukecoy.discogs.data.dao;

import com.lukecoy.discogs.core.Artist;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

public interface ArtistDao {

  @SqlQuery("SELECT id, name, data_quality FROM artist WHERE id = :id")
  Artist get(@Bind("id") long id);

}
