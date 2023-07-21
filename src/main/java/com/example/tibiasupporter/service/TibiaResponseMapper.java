package com.example.tibiasupporter.service;

import com.example.tibiasupporter.model.worlds.Player;
import com.example.tibiasupporter.model.worlds.Response;
import com.example.tibiasupporter.model.worlds.Worlds;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TibiaResponseMapper {

    public String getOnlinePlayers() {
        String tibiaUrl = "https://api.tibiadata.com/v3/world/vunira";
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForEntity(tibiaUrl, String.class).getBody();
        System.out.println(json);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Response response = objectMapper.readValue(json, Response.class);
            Worlds worlds = response.getWorlds();
            List<Player> onlinePlayers = worlds.getWorld().getOnline_players();
            return onlinePlayers.toString();

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
