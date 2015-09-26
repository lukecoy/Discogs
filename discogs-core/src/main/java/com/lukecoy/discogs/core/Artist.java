package com.lukecoy.discogs.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

    private final String name;
    private final String profile;
    private final long id;

    @JsonCreator
    public Artist(@JsonProperty("name") String name,
                  @JsonProperty("profile") String profile,
                  @JsonProperty("id") long id) {
        this.name = name;
        this.profile = profile;
        this.id = id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getProfile() {
        return profile;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

}
