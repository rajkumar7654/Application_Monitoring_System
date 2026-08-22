package com.example.demo.dto;

public class UserDto {

    private String id;
    private String name;
    private String city;

    public UserDto(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}