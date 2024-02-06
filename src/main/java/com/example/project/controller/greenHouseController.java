package com.example.project.controller;

import com.example.project.model.User;
import com.example.project.model.greenHouse;
import org.springframework.web.bind.annotation.*;
import  com.example.project.service.greenHouseService;

import java.util.List;

@RestController
@RequestMapping("/greenHouse")
public class greenHouseController {
    public greenHouseController(greenHouseService greenHouseService) {
        this.greenHouseService = greenHouseService;
    }

    greenHouseService greenHouseService;
    @GetMapping("{greenHouseId}")
    public greenHouse getGreenHouseDetails(@PathVariable("greenHouseId") String greenHouseId) {
        return greenHouseService.getGreenHouse(greenHouseId);


    }

    @PostMapping("/register")
    public String createGreenHouse(@RequestBody greenHouse greenHouse) {

        return greenHouseService.createGreenHouse(greenHouse);


    }

    @PutMapping("/update")
    public String updateGreenHouse(@RequestBody greenHouse greenHouse) {
        return greenHouseService.updateGreenHouse(greenHouse);


    }

    @GetMapping("/getAll")
    public List<greenHouse> getAllGreenHouses(){
        return greenHouseService.getAllGreenHouses();

    }

    @DeleteMapping("{greenHouseId}")
    public String deleteGreenHouse(@PathVariable("greenHouseId")String greenHouseId) {


        return greenHouseService.deleteGreenHouse(greenHouseId);


    }

}
