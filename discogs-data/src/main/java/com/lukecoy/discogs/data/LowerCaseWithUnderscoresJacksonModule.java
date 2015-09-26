package com.lukecoy.discogs.data;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class LowerCaseWithUnderscoresJacksonModule extends SimpleModule {

    @Override
    public void setupModule(SetupContext context) {
        context.setNamingStrategy(new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy());
    }

}
