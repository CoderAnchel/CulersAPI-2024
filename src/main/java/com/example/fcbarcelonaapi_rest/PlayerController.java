package com.example.fcbarcelonaapi_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/players/{name}")
    public Player getPlayerBy(@PathVariable String name) {
        return playerService.getPlayerByName(name);
    }

    @GetMapping("/players/numbers/{number}")
    public Player getPlayerByNum(@PathVariable String number) {
        return playerService.getPlayerByNumber(number);
    }

    @GetMapping("/players/numbers")
    public List<PlayerNumber> getNumbers() {
        return playerService.getAllNumbers();
    }

    @GetMapping("/players/nationality/{name}")
    public  List<Player> getNationality(@PathVariable String name) {
        return playerService.getAllNationality(name);
    }

    @GetMapping("/players/{name}/{country}")
    public List<Player> getMultipleCriteria(@PathVariable String name,@PathVariable String country) {
        return playerService.getPlayersByMultipleCriteria(name, country);
    }
}
