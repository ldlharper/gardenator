package com.schwifty.gardenator.status.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.schwifty.gardenator.status.json.StatusJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class StatusService {

    @Value("${files.status.path}")
    private String statusPath;

    @Autowired
    private ObjectMapper objectMapper;

    public StatusJson getStatus() throws IOException {
        return objectMapper.readValue(new File(statusPath), StatusJson.class);
    }

}
