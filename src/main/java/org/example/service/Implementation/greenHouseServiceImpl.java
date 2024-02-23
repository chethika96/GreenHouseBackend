package org.example.service.Implementation;


import org.example.model.greenHouse;
import org.example.repository.greenHouseRepository;
import org.example.service.greenHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class greenHouseServiceImpl implements greenHouseService {

    greenHouseRepository greenHouseRepository;




    @Autowired
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
