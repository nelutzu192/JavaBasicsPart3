package com.skillbrain.classes;

public class ExemplifyClassesAndObjects {

    public static void main(String[] args){

        //definim un obiect de tip masina

        //folosind constructorul cu parametrul brand
        Car car = new Car("Honda");
        car.setColor("red");
        car.setFuelType("benzina");
        car.setModel("Civic");

        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getFuelType() + " " + car.getColor());


    }

}
