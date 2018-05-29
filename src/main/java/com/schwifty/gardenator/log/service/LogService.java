package com.schwifty.gardenator.log.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Set;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;
import static org.apache.commons.io.FileUtils.readFileToString;

@Service
public class LogService {

    public static final String DEFAULT_LOG_FILE = "watctld.log";

    @Value("${files.log.directory}")
    private String logDirectory;


    public Set<String> getLogFiles() {
        File directory = new File(logDirectory);
        File [] files = directory.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".log");
            }
        });

        return asList(files).stream().map(File::getName).collect(toSet());
    }

    public String getLogContentsHtml(String filename) throws IOException {
        File file = new File(logDirectory + "/" + filename);
        String contents = readFileToString(file, UTF_8);
        return contents.replaceAll("(\r\n|\n)", "<br />");
    }

}
