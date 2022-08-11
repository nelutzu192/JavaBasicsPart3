package com.skillbrain.classes;

public class Car {

    //definire atribute - le definim ca fiind private

    private String color;
    private String brand;
    private String model;
    private String fuelType;

    //constructori - folosit ca sa instantiem o clasa
    // exista si constructor implicit (default) - care iti instantiaza un obiect gol

    public Car(){

    }

    public Car(String color, String brand, String model, String fuelType){
        this.color = color;
        this.brand = brand;
        this.model = brand;
        this.fuelType = fuelType;

    }

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String color, String brand, String model){
        this.fuelType = "diesel";
    }


    //definire metode

    //gettere si settere pt fiecare atribut


    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
