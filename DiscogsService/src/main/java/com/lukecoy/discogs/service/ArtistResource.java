package com.lukecoy.discogs.service;

import com.google.inject.Inject;
import com.lukecoy.discogs.core.Artist;
import com.lukecoy.discogs.data.dao.ArtistDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/artist")
@Produces(MediaType.APPLICATION_JSON)
public class ArtistResource {

  private final ArtistDao artistDao;

  @Inject
  public ArtistResource(ArtistDao artistDao) {
    this.artistDao = artistDao;
  }

  @GET
  @Path("/{id}")
  public Artist getArtist(@PathParam("id") long id) {
    return artistDao.get(id);
  }

}
