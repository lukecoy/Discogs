package com.lukecoy.discogs.service.resources;

import com.lukecoy.discogs.data.ArtistDao;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/discogs")
@Produces(MediaType.APPLICATION_JSON)
public class ArtistResource {

    private final ArtistDao artistDao;

    @Inject
    public ArtistResource(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    @GET
    public Response getArtist() {
        return Response.ok().build();
    }

}
