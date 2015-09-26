package com.lukecoy.discogs.service.resources;

import com.lukecoy.discogs.core.Artist;
import com.lukecoy.discogs.data.ArtistDao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/discogs/artist")
@Produces(MediaType.APPLICATION_JSON)
public class ArtistResource {

    private final ArtistDao artistDao;

    @Inject
    public ArtistResource(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    @GET
    @Path("/{name}")
    public List<Artist> getArtist(@PathParam("name") String name) {
        return artistDao.getArtist(name);
    }

}
