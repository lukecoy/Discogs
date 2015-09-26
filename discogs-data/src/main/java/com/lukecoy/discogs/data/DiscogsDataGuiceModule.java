package com.lukecoy.discogs.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.lukecoy.discogs.config.DiscogsGuiceModule;
import org.skife.jdbi.v2.DBI;

public class DiscogsDataGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new DiscogsGuiceModule());
    }

    @Provides
    public ArtistDao providesNameDao(DBI jdbi) {
        return jdbi.onDemand(ArtistDao.class);
    }

}
