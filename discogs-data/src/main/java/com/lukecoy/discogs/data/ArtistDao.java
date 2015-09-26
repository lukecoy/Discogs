package com.lukecoy.discogs.data;

import com.lukecoy.discogs.core.Artist;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import java.util.List;

public interface ArtistDao {

    @SqlQuery("SELECT name, profile, id FROM artist WHERE UPPER(name)=UPPER(:name)")
    public List<Artist> getArtist(@Bind("name") String name);

}
