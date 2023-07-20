package com.example.tibiasupporter.model.worlds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {
    private String name;
    private int level;
    private String vocation;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", vocation='" + vocation + '\'' +
                '}' + "\n";
    }
}

