package com.schwifty.gardenator.schedule.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionJson {
    @JsonProperty("SessionName")
    private String name;
    @JsonProperty("StartMin")
    private Integer startMin;
    @JsonProperty("Zone1Min")
    private Integer zone1Min;
    @JsonProperty("Zone2Min")
    private Integer zone2Min;
    @JsonProperty("Zone3Min")
    private Integer zone3Min;
    @JsonProperty("Zone4Min")
    private Integer zone4Min;
    @JsonProperty("Zone5Min")
    private Integer zone5Min;
    @JsonProperty("Zone6Min")
    private Integer zone6Min;
    @JsonProperty("Zone7Min")
    private Integer zone7Min;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartMin() {
        return startMin;
    }

    public void setStartMin(Integer startMin) {
        this.startMin = startMin;
    }

    public Integer getZone1Min() {
        return zone1Min;
    }

    public void setZone1Min(Integer zone1Min) {
        this.zone1Min = zone1Min;
    }

    public Integer getZone2Min() {
        return zone2Min;
    }

    public void setZone2Min(Integer zone2Min) {
        this.zone2Min = zone2Min;
    }

    public Integer getZone3Min() {
        return zone3Min;
    }

    public void setZone3Min(Integer zone3Min) {
        this.zone3Min = zone3Min;
    }

    public Integer getZone4Min() {
        return zone4Min;
    }

    public void setZone4Min(Integer zone4Min) {
        this.zone4Min = zone4Min;
    }

    public Integer getZone5Min() {
        return zone5Min;
    }

    public void setZone5Min(Integer zone5Min) {
        this.zone5Min = zone5Min;
    }

    public Integer getZone6Min() {
        return zone6Min;
    }

    public void setZone6Min(Integer zone6Min) {
        this.zone6Min = zone6Min;
    }

    public Integer getZone7Min() {
        return zone7Min;
    }

    public void setZone7Min(Integer zone7Min) {
        this.zone7Min = zone7Min;
    }
}
