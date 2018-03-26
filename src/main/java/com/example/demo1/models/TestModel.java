package com.example.demo1.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("ID")
    private int id;
    @JsonProperty("NAME")
    private String name;
    @JsonProperty("GENDER")
    private int gender;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
}
