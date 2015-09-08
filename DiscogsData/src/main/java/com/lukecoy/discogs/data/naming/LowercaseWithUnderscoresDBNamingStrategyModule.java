package com.lukecoy.discogs.data.naming;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class LowercaseWithUnderscoresDBNamingStrategyModule extends SimpleModule {

  @Override
  public void setupModule(SetupContext context) {
    context.setNamingStrategy(new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy());
  }

}
