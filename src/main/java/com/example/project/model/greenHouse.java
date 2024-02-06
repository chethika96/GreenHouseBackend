package com.example.project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="greenHouse")
public class greenHouse {
@Id
    private String greenHouseId;
    private String ownerId;
    private String environmentDetails;
    private int phoneNumber;


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

