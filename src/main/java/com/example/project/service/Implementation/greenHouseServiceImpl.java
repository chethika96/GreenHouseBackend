package com.example.project.service.Implementation;

import com.example.project.model.greenHouse;
import com.example.project.repository.greenHouseRepository;
import com.example.project.service.greenHouseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class greenHouseServiceImpl implements greenHouseService {

    greenHouseRepository greenHouseRepository;
    public greenHouseServiceImpl(greenHouseRepository greenHouseRepository) {
        this.greenHouseRepository = greenHouseRepository;
    }


    @Override
    public String createGreenHouse(greenHouse greenHouse) {
        greenHouseRepository.save(greenHouse);
        return ("GreenHouse data saved successfully.");
    }

    @Override
    public String updateGreenHouse(greenHouse greenHouse) {
        greenHouseRepository.save(greenHouse);
        return ("GreenHouse data updated successfully.");
    }

    @Override
    public String deleteGreenHouse(String greenHouseId) {
         greenHouseRepository.deleteById(greenHouseId);
        return("GreenHouse data deleted successfully.");
    }

    @Override
    public greenHouse getGreenHouse(String greenHouseId) {
        return greenHouseRepository.findById(greenHouseId).get();
    }

    @Override
    public List<greenHouse> getAllGreenHouses() {
        return greenHouseRepository.findAll();
    }
}
