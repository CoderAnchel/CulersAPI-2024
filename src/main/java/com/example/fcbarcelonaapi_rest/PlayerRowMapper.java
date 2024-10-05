package com.example.fcbarcelonaapi_rest;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRowMapper implements RowMapper<Player> {
    @Override
    public Player mapRow(ResultSet result, int rowNum) throws SQLException {
        Player player = new Player();
        player.setId(result.getInt("id"));
        player.setName(result.getString("name"));
        player.setNationality(result.getString("nationality"));
        player.setWeight(result.getString("weight"));
        player.setHeight(result.getString("height"));
        player.setDateOfBirth(String.valueOf(result.getDate("dateOfBirth")));
        player.setNumber(result.getInt("number"));
        player.setAppearances(result.getInt("apparences"));
        player.setGoals(result.getInt("goals"));
        player.setAssists(result.getInt("assists"));
        player.setCleanSheets(result.getInt("cleanSheets"));
        player.setSaves(result.getInt("saves"));
        return player;
    }
}

class PlayerNumberRowMapper implements RowMapper<PlayerNumber> {
    @Override
    public PlayerNumber mapRow(ResultSet result, int rowNum) throws SQLException {
        PlayerNumber playerNumber = new PlayerNumber();
        playerNumber.setId(result.getInt("id"));
        playerNumber.setNumber(result.getInt("number"));
        return playerNumber;
    }
}

