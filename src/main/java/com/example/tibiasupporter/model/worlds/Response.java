package com.example.tibiasupporter.model.worlds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response {
    private Worlds worlds;
    private Information information;
}
