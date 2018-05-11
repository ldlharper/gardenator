package com.schwifty.gardenator.monitor.service;

import com.schwifty.gardenator.monitor.dto.TempReading;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.stream.StreamSupport;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

@Service
public class MonitorService {

    @Value("${files.monitor.directory}")
    private String monitorDirectory;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

    public Set<String> getMonitorFiles() {
        File directory = new File(monitorDirectory);
        File [] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".csv");
            }
        });

        return asList(files).stream().map(File::getName).collect(toSet());
    }

    public List<TempReading> getMonitorData(String filename) throws IOException {
        Reader in = new FileReader(monitorDirectory + "/" + filename);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);
        return StreamSupport.stream(records.spliterator(), false)
                .filter(record -> record.get(0) != null && record.get(1) != null)
                .map(record -> new TempReading(LocalDateTime.parse(record.get(0), formatter),
                                new BigDecimal(record.get(1).trim()))).collect(toList());
    }
}
