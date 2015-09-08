package com.lukecoy.discogs.service;

import com.google.inject.AbstractModule;
import com.lukecoy.discogs.data.DiscogsDataModule;

public class DiscogsServiceModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new DiscogsDataModule());
  }

}
