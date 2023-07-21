package com.example.tibiasupporter.controller;

import com.example.tibiasupporter.service.TibiaResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    private final TibiaResponseMapper tibiaResponseMapper;

    @Autowired
    public WorldController(TibiaResponseMapper tibiaResponseMapper) {
        this.tibiaResponseMapper = tibiaResponseMapper;
    }

    @GetMapping("/online")
    public String getOnlinePlayers() {
        return tibiaResponseMapper.getOnlinePlayers();
    }



}
