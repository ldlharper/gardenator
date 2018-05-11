package com.schwifty.gardenator.schedule.controller;

import com.schwifty.gardenator.schedule.json.ScheduleJson;
import com.schwifty.gardenator.schedule.json.SessionJson;
import com.schwifty.gardenator.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

import static java.util.Optional.ofNullable;

@Controller
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule")
    public String getSchedule(Model model) throws IOException {
        return displayScheduleForm(model, scheduleService.getSchedule());
    }

    @PostMapping("/schedule")
    public String saveSchedule(@ModelAttribute("scheduleJson") ScheduleJson scheduleJson,
                               Model model) throws IOException {
        scheduleService.saveSchedule(scheduleJson);
        return getSchedule(model);
    }

    @PostMapping(value = "/schedule", params = "deleteSession")
    public String deleteSchedule(@ModelAttribute("scheduleJson") ScheduleJson scheduleJson,
                                 @RequestParam("deleteSession") int sessionToDelete,
                                 Model model) throws IOException {
        scheduleJson.getSessions().remove(sessionToDelete);
        return displayScheduleForm(model, scheduleJson);
    }

    @PostMapping(value = "/schedule", params = "addSession")
    public String addSchedule(@ModelAttribute("scheduleJson") ScheduleJson scheduleJson,
                              Model model) throws IOException {
        ofNullable(scheduleJson.getSessions()).ifPresent(list -> list.add(new SessionJson()));
        return displayScheduleForm(model, scheduleJson);
    }

    private String displayScheduleForm(Model model, ScheduleJson scheduleJson) throws IOException {
        model.addAttribute("scheduleJson", scheduleJson);
        return "schedule";
    }
}
