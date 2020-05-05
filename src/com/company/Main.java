package com.company;

import devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Lion");
        lion.name = "Brutus";

        Car smallCar = new Car("Ford", "Focus");
        smallCar.numberOfDoors = 5;
        smallCar.combustion = 12.0;
        smallCar.setPrice(1000.0);

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Rosicki";
        me.pet = lion;

        me.getSalary();
        me.setCar(smallCar);
        me.setSalary(3000.0);
        me.getSalary();


        lion.feed();
        me.pet.feed();

        lion.takeForAWalk();
        me.pet.takeForAWalk();

        Car mediumCar = new Car("Ford", "Focus");

        System.out.println(smallCar.equals(mediumCar));

        System.out.println(lion);
        System.out.println(smallCar);


    }
}
