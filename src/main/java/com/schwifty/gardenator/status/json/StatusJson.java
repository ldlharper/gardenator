package com.schwifty.gardenator.status.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class StatusJson {

    @JsonProperty("Status Time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime time;
    @JsonProperty("Pump Status")
    private String pumpStatus;
    @JsonProperty("Zone Status")
    private List<ZoneStatusJson> zoneStatus;

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getPumpStatus() {
        return pumpStatus;
    }

    public void setPumpStatus(String pumpStatus) {
        this.pumpStatus = pumpStatus;
    }

    public List<ZoneStatusJson> getZoneStatus() {
        return zoneStatus;
    }

    public void setZoneStatus(List<ZoneStatusJson> zoneStatus) {
        this.zoneStatus = zoneStatus;
    }
}
