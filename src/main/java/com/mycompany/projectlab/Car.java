package com.mycompany.projectlab;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    private String brand;
    private String model;
    private int year;
    private int registrationNumber;
    private int rentalPrice;

    public Car(String brand, String model, int year, int registrationNumber, int rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.rentalPrice = rentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return brand + " | " + model + " | " + year +
               " | Reg: " + registrationNumber +
               " | Price: $" + rentalPrice;
    }
    
  
}



