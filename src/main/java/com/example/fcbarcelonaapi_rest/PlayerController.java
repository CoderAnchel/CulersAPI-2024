package com.example.fcbarcelonaapi_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerService.getAllPlayers();
    }

}
