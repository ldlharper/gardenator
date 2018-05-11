package com.schwifty.gardenator.zone.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ZonesJson {

    @JsonProperty("Zones Config")
    List<ZoneJson> zones;

    public List<ZoneJson> getZones() {
        return zones;
    }

    public void setZones(List<ZoneJson> zones) {
        this.zones = zones;
    }
}