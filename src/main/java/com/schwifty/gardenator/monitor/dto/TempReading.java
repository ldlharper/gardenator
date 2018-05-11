package com.schwifty.gardenator.monitor.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TempReading {

    private LocalDateTime date;
    private BigDecimal temp;

    public TempReading() {
    }

    public TempReading(LocalDateTime date, BigDecimal temp) {
        this.date = date;
        this.temp = temp;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }
}
