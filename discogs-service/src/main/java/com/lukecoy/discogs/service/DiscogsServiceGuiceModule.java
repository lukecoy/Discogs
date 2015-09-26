package com.lukecoy.discogs.service;

import com.google.inject.AbstractModule;
import com.lukecoy.discogs.data.DiscogsDataGuiceModule;

public class DiscogsServiceGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new DiscogsDataGuiceModule());
    }

}
