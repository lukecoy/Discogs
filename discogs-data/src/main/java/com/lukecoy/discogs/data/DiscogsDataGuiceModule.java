package com.lukecoy.discogs.data;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.hubspot.rosetta.Rosetta;
import com.hubspot.rosetta.jdbi.RosettaMapperFactory;
import com.lukecoy.discogs.config.DiscogsGuiceModule;
import org.skife.jdbi.v2.DBI;

public class DiscogsDataGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        Rosetta.addModule(new LowerCaseWithUnderscoresJacksonModule());
        install(new DiscogsGuiceModule());
    }

    @Provides
    public ArtistDao providesNameDao(DBI jdbi) {
        jdbi.registerMapper(new RosettaMapperFactory());
        return jdbi.onDemand(ArtistDao.class);
    }

}
