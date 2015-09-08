package com.lukecoy.discogs.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Artist {

  private final int id;
  private final String name;
  private final String dataQuality;

  @JsonCreator
  public Artist(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("dataQuality") String dataQuality) {
    this.id = id;
    this.name = name;
    this.dataQuality = dataQuality;
  }

  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("dataQuality")
  public String getDataQuality() {
    return dataQuality;
  }

}
