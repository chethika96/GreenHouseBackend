package org.example.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="greenHouse")
public class greenHouse {
    @Id
    private int greenHouseId;

    public int getGreenHouseId() {
        return greenHouseId;
    }

    public void setGreenHouseId(int greenHouseId) {
        this.greenHouseId = greenHouseId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getEnvironmentDetails() {
        return environmentDetails;
    }

    public void setEnvironmentDetails(String environmentDetails) {
        this.environmentDetails = environmentDetails;
    }

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

