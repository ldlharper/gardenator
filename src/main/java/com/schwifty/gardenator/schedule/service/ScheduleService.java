package com.schwifty.gardenator.schedule.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.schwifty.gardenator.schedule.json.ScheduleJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ScheduleService {

    @Value("${files.schedule.path}")
    private String schedulePath;

    @Autowired
    private ObjectMapper objectMapper;

    public ScheduleJson getSchedule() throws IOException {
        return objectMapper.readValue(new File(schedulePath), ScheduleJson.class);
    }

    public void saveSchedule(ScheduleJson scheules) throws IOException {
        objectMapper.writeValue(new File(schedulePath), scheules);
    }

}
