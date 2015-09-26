package com.lukecoy.discogs.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist {

    private final String name;
    private final int[] releases;
    private final String dataQuality;

    public Artist(String name, int[] releases, String dataQuality) {
        this.name = name;
        this.releases = releases;
        this.dataQuality = dataQuality;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public int[] getReleases() {
        return releases;
    }

    @JsonProperty
    public String getDataQuality() {
        return dataQuality;
    }

}
