package com.lukecoy.discogs.service;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.lukecoy.dropwizardbase.config.DropwizardBaseConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DiscogsService extends Application<DropwizardBaseConfiguration> {

  private GuiceBundle<DropwizardBaseConfiguration> guiceBundle;

  public static void main(String[] args) throws Exception {
    new DiscogsService().run();
  }

  @Override
  public void run(DropwizardBaseConfiguration discogsConfiguration, Environment environment) throws Exception {

  }

  @Override
  public void initialize(Bootstrap<DropwizardBaseConfiguration> bootstrap) {
    guiceBundle = GuiceBundle.<DropwizardBaseConfiguration>newBuilder()
        .enableAutoConfig(getClass().getPackage().getName())
        .setConfigClass(DropwizardBaseConfiguration.class)
        .build();

    bootstrap.addBundle(guiceBundle);
  }

}
