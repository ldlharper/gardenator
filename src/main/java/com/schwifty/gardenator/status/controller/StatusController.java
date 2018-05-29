package com.schwifty.gardenator.status.controller;

import com.schwifty.gardenator.log.service.LogService;
import com.schwifty.gardenator.status.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class StatusController {

    @Autowired
    private StatusService statusService;

    @Autowired
    private LogService logService;

    @GetMapping({"/", "/status"})
    public String status(Model model) throws IOException {
        model.addAttribute("statusJson", statusService.getStatus());
        model.addAttribute("contents", logService.getLogContentsHtml(LogService.DEFAULT_LOG_FILE));
        model.addAttribute("filename", LogService.DEFAULT_LOG_FILE);
        return "status";
    }
}
