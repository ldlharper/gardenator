package com.schwifty.gardenator.schedule.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScheduleJson {
    @JsonProperty("StartMonthDay")
    private Integer startDay;
    @JsonProperty("StartMonth")
    private Integer startMonth;
    @JsonProperty("EndMonthDay")
    private Integer endDay;
    @JsonProperty("EndMonth")
    private Integer endMonth;
    @JsonProperty("Sunday")
    private boolean sunday;
    @JsonProperty("Monday")
    private boolean monday;
    @JsonProperty("Tuesday")
    private boolean tuesday;
    @JsonProperty("Wednesday")
    private boolean wednesday;
    @JsonProperty("Thursday")
    private boolean thursday;
    @JsonProperty("Friday")
    private boolean friday;
    @JsonProperty("Saturday")
    private boolean saturday;
    @JsonProperty("Sessions")
    private List<SessionJson> sessions;

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public Integer getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(Integer startMonth) {
        this.startMonth = startMonth;
    }

    public Integer getEndDay() {
        return endDay;
    }

    public void setEndDay(Integer endDay) {
        this.endDay = endDay;
    }

    public Integer getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(Integer endMonth) {
        this.endMonth = endMonth;
    }

    public boolean isSunday() {
        return sunday;
    }

    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    public boolean isMonday() {
        return monday;
    }

    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    public boolean isTuesday() {
        return tuesday;
    }

    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    public boolean isWednesday() {
        return wednesday;
    }

    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    public boolean isThursday() {
        return thursday;
    }

    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    public boolean isFriday() {
        return friday;
    }

    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    public boolean isSaturday() {
        return saturday;
    }

    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    public List<SessionJson> getSessions() {
        return sessions;
    }

    public void setSessions(List<SessionJson> sessions) {
        this.sessions = sessions;
    }
}