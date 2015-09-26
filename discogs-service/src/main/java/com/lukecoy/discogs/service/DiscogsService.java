package com.lukecoy.discogs.service;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.lukecoy.discogs.config.DiscogsConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DiscogsService extends Application<DiscogsConfiguration> {

    private static final String AUTO_CONFIG_PACKAGE = "com.lukecoy.discogs";

    public static void main(String[] args) throws Exception {
        new DiscogsService().run(args);
    }

    @Override
    public void initialize(Bootstrap<DiscogsConfiguration> bootstrap) {
        GuiceBundle<DiscogsConfiguration> guiceBundle = GuiceBundle.<DiscogsConfiguration>newBuilder()
                .addModule(new DiscogsServiceGuiceModule())
                .enableAutoConfig(AUTO_CONFIG_PACKAGE)
                .setConfigClass(DiscogsConfiguration.class)
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(DiscogsConfiguration configuration, Environment environment) throws Exception {
    }

}
