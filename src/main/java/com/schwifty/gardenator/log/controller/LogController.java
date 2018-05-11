package com.schwifty.gardenator.log.controller;

import com.schwifty.gardenator.log.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/logs")
    public String getLogs(Model model) {
        model.addAttribute("files", logService.getLogFiles());
        return "logs";
    }

    @RequestMapping("/logs/{filename}")
    public String getLogs(Model model, @PathVariable("filename") String filename) throws IOException {
        model.addAttribute("contents", logService.getLogContentsHtml(filename));
        model.addAttribute("filename", filename);
        return "log-contents";
    }
}
