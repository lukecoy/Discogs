package com.lukecoy.discogs.health;

import com.codahale.metrics.health.HealthCheck;

public class DatabaseHealthCheck extends HealthCheck {

  @Override
  protected Result check() throws Exception {
    return Result.healthy();
  }

}
