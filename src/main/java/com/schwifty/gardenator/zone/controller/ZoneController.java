package com.schwifty.gardenator.zone.controller;

import com.schwifty.gardenator.zone.json.ZoneJson;
import com.schwifty.gardenator.zone.json.ZonesJson;
import com.schwifty.gardenator.zone.service.ZoneService;
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
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @GetMapping("/zone")
    public String getZone(Model model) throws IOException {
        return displayZoneForm(model, zoneService.getZones());
    }

    @PostMapping("/zone")
    public String saveZone(@ModelAttribute("zonesJson") ZonesJson zonesJson,
                           Model model) throws IOException {
        zoneService.saveZones(zonesJson);
        return getZone(model);
    }

    @PostMapping(value = "/zone", params = "deleteZone")
    public String deleteZone(@ModelAttribute("zonesJson") ZonesJson zonesJson,
                             @RequestParam("deleteZone") int zoneToDelete,
                           Model model) throws IOException {
        zonesJson.getZones().remove(zoneToDelete);
        return displayZoneForm(model, zonesJson);
    }

    @PostMapping(value = "/zone", params = "addZone")
    public String addZone(@ModelAttribute("zonesJson") ZonesJson zonesJson,
                             Model model) throws IOException {
        ofNullable(zonesJson.getZones()).ifPresent(list -> list.add(new ZoneJson()));
        return displayZoneForm(model, zonesJson);
    }

    private String displayZoneForm(Model model, ZonesJson zonesJson) {
        model.addAttribute("zonesJson", zonesJson);
        return "zone";

    }
}
