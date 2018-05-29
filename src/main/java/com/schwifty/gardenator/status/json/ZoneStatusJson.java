package com.schwifty.gardenator.status.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ZoneStatusJson {

    @JsonProperty("Zone Name")
    private String name;
    @JsonProperty("Valve Status")
    private String valveStatus;
    @JsonProperty("Temp Mon")
    private String tempMon;
    @JsonProperty("Temp")
    private BigDecimal temp;
    @JsonProperty("Moisture Mon")
    private String moistureMon;
    @JsonProperty("Moisture")
    private String moisture;
    @JsonProperty("Last Water Start")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime lastWaterStart;
    @JsonProperty("Last Water End")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime lastWaterEnd;
    @JsonProperty("Last Temp Read")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime lastTempRead;
    @JsonProperty("Last Moisture Read")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd HH:mm")
    private LocalDateTime lastMoistRead;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValveStatus() {
        return valveStatus;
    }

    public void setValveStatus(String valveStatus) {
        this.valveStatus = valveStatus;
    }

    public String getTempMon() {
        return tempMon;
    }

    public void setTempMon(String tempMon) {
        this.tempMon = tempMon;
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public String getMoistureMon() {
        return moistureMon;
    }

    public void setMoistureMon(String moistureMon) {
        this.moistureMon = moistureMon;
    }

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }

    public LocalDateTime getLastWaterStart() {
        return lastWaterStart;
    }

    public void setLastWaterStart(LocalDateTime lastWaterStart) {
        this.lastWaterStart = lastWaterStart;
    }

    public LocalDateTime getLastWaterEnd() {
        return lastWaterEnd;
    }

    public void setLastWaterEnd(LocalDateTime lastWaterEnd) {
        this.lastWaterEnd = lastWaterEnd;
    }

    public LocalDateTime getLastTempRead() {
        return lastTempRead;
    }

    public void setLastTempRead(LocalDateTime lastTempRead) {
        this.lastTempRead = lastTempRead;
    }

    public LocalDateTime getLastMoistRead() { return lastMoistRead; }

    public void setLastMoistRead(LocalDateTime lastMoistRead) { this.lastMoistRead = lastMoistRead; }
}
