package com.schwifty.gardenator.zone.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.schwifty.gardenator.zone.json.ZonesJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ZoneService {

    @Value("${files.zone.path}")
    private String zonePath;

    @Autowired
    private ObjectMapper objectMapper;

    public ZonesJson getZones() throws IOException {
        return objectMapper.readValue(new File(zonePath), ZonesJson.class);
    }

    public void saveZones(ZonesJson zones) throws IOException {
        objectMapper.writeValue(new File(zonePath), zones);
    }

}
