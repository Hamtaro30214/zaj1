package com.company;

public class Car {
    final String producer;
    final String model;
    int numberOfDoors;
    Double combustion;
    private Double price;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
