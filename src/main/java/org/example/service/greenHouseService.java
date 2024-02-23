package org.example.service;


import org.example.model.greenHouse;
import org.springframework.stereotype.Service;


import java.util.List;

public interface greenHouseService {

    public String createGreenHouse(greenHouse greenHouse);
    public String updateGreenHouse(greenHouse greenHouse);
    public String deleteGreenHouse(String greenHouseId);
    public greenHouse getGreenHouse(String greenHouseId);

    public List<greenHouse> getAllGreenHouses();
}
