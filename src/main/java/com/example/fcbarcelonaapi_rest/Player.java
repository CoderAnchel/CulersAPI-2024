package com.example.fcbarcelonaapi_rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    String name;
    String nationality;
    String image;
    String weight;
    String height;
    String dateOfBirth;
    String debut;
    int number;
    int appearances;
    int cleansheets;
    int saves;
    int goals;
    int assists;

    public Player(String name, String nationality, String image, String weight, String height, String dateOfBirth,String debut, int number,int appearances,int cleansheets,int saves,int goals,
    int assists ) {
        this.name = name;
        this.nationality = nationality;
        this.image = image;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.debut = debut;
        this.number = number;
        this.appearances = appearances;
        this.cleansheets = cleansheets;
        this.saves = saves;
        this.goals = goals;
        this.assists = assists;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String Name) {
        this.name = Name;
    }

    @JsonProperty
    public String getNationality() {
        return nationality;
    }

    @JsonProperty
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty
    public String getImage() {
        return image;
    }

    @JsonProperty
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty
    public String getWeight() {
        return weight;
    }

    @JsonProperty
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty
    public String getHeight() {
        return height;
    }

    @JsonProperty
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty
    public int getNumber() {
        return number;
    }

    @JsonProperty
    public void setNumber(int number) {
        this.number = number;
    }

    @JsonProperty
    public int getAppearances() {
        return appearances;
    }

    @JsonProperty
    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    @JsonProperty
    public int getCleanSheets() {
        return cleansheets;
    }

    @JsonProperty
    public void setCleanSheets(int cleanSheets) {
        this.cleansheets = cleanSheets;
    }

    @JsonProperty
    public int getSaves() {
        return saves;
    }

    @JsonProperty
    public void setSaves(int saves) {
        this.saves = saves;
    }

}
