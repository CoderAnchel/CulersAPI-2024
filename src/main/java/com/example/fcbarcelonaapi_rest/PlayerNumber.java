package com.example.fcbarcelonaapi_rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerNumber {
    int id;
    int number;

    public PlayerNumber() {

    }

    public PlayerNumber(int id, int number) {
        this.id = id;
        this.number = number;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty
    public void setNumber(int number) {
        this.number = number;
    }

    @JsonProperty
    public int number() {
        return number;
    }
}
