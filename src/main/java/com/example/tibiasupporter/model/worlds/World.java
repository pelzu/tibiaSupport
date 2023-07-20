package com.example.tibiasupporter.model.worlds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class World {
    private String name;
    private String status;
    private int players_online;
    private int record_players;
    private String record_date;
    private String creation_date;
    private String location;
    private String pvp_type;
    private boolean premium_only;
    private String transfer_type;
    private List<String> world_quest_titles;
    private boolean battleye_protected;
    private String battleye_date;
    private String game_world_type;
    private String tournament_world_type;
    private List<Player> online_players;
}
