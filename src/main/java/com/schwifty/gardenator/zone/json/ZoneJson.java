package com.schwifty.gardenator.zone.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoneJson {

    @JsonProperty("Zone Name")
    private String name;
    @JsonProperty("Temp Mon")
    private boolean tempMon;
    @JsonProperty("Temp Device Name")
    private String deviceName;
    @JsonProperty("Moisture Mon")
    private boolean moistureMon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTempMon() {
        return tempMon;
    }

    public void setTempMon(boolean tempMon) {
        this.tempMon = tempMon;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isMoistureMon() {
        return moistureMon;
    }

    public void setMoistureMon(boolean moistureMon) {
        this.moistureMon = moistureMon;
    }
}
