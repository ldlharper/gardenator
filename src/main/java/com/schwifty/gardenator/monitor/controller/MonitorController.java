package com.schwifty.gardenator.monitor.controller;

import com.schwifty.gardenator.monitor.dto.TempReading;
import com.schwifty.gardenator.monitor.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Controller
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @RequestMapping("/monitor")
    public String getLogs(Model model) {
        model.addAttribute("files", monitorService.getMonitorFiles());
        return "monitor";
    }

    @RequestMapping("/monitor/{filename}")
    public String getLogs(Model model, @PathVariable("filename") String filename) throws IOException {
        model.addAttribute("filename", filename);
        List<TempReading> tempReadings = monitorService.getMonitorData(filename);
        model.addAttribute("data", tempReadings);
        Optional<TempReading> minimum = tempReadings.stream().min((o1, o2) -> o1.getTemp().compareTo(o2.getTemp()));
        model.addAttribute("minimum", minimum.get().getTemp().subtract(new BigDecimal("0.1")));
        return "monitor-contents";
    }
}
