package com.example.project.service;

import com.example.project.model.greenHouse;

import java.util.List;

public interface greenHouseService {

    public String createGreenHouse(greenHouse greenHouse);
    public String updateGreenHouse(greenHouse greenHouse);
    public String deleteGreenHouse(String greenHouseId);
    public greenHouse getGreenHouse(String greenHouseId);

    public List<greenHouse> getAllGreenHouses();
}
