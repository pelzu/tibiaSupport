package com.example.tibiasupporter.controller;

import com.example.tibiasupporter.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    private final WorldService worldService;

    @Autowired
    public WorldController(WorldService worldService) {
        this.worldService = worldService;
    }

    @GetMapping("/online")
    public String getOnlinePlayers() {
        return worldService.getOnlinePlayers();
    }



}
