package com.example.fcbarcelonaapi_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Player getPlayerByName(String name) {
        String sql = "SELECT * FROM jugadores WHERE name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{name},new PlayerRowMapper());
    }

    public Player getPlayerByNumber(String number) {
        String sql = "SELECT * FROM jugadores WHERE number = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{number},new PlayerRowMapper());
    }

    public List<Player> getAllNationality(String name) {
        String sql = "SELECT * FROM jugadores WHERE nationality = ?";
        return jdbcTemplate.query(sql, new Object[]{name},new PlayerRowMapper());
    }

    public List<PlayerNumber> getAllNumbers() {
        String sql = "SELECT id, number FROM jugadores";
        return jdbcTemplate.query(sql, new PlayerNumberRowMapper());
    }

    public List<Player> getAllPlayers() {
        String sql = "SELECT * FROM jugadores";
        return jdbcTemplate.query(sql, new PlayerRowMapper());
    }

    public List<Player> getPlayersByMultipleCriteria(String name, String nationality) {
        String sql = "SELECT * FROM jugadores WHERE name = ? OR nationality = ?";
        return jdbcTemplate.query(sql, new Object[]{name, nationality}, new PlayerRowMapper());
    }
}