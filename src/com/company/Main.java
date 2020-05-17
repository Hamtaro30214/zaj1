package com.company;

import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Animal lion = new Animal("Lion") {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        lion.name = "Brutus";

        Car smallCar = new Car("Ford", "Focus", 2004);
        smallCar.numberOfDoors = 5;
        smallCar.combustion = 12.0;
        smallCar.setPrice(1000.0);

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Rosicki";
        me.pet = lion;

        me.getSalary();
        me.buyCar(smallCar);

        //me.getCar();

        me.setSalary(3000.0);
        me.getSalary();


        lion.feed();
        me.pet.feed();

        lion.takeForAWalk();
        me.pet.takeForAWalk();

        Car mediumCar = new Car("Ford", "Focus", 2004);

        System.out.println(smallCar.equals(mediumCar));

        System.out.println(lion);
        System.out.println(smallCar);

        Phone samsung = new Phone("Samsung", "Galaxy", 2020);
        samsung.screenSize = 120.5;
        me.phone = samsung;
        System.out.println(samsung);
        me.phone.turnOn();
        System.out.println();

        Human carSeller = new Human();
        carSeller.firstName = "Waldemar";
        carSeller.lastName = "Padalski";
        carSeller.cash = 2100.0;
        Car carForSell = new Car("Opel", "Vectra", 2006);
        carSeller.setCar(carForSell);
        //carSeller.getCar();

        System.out.println();
        Human petSeller = new Human();
        petSeller.firstName = "Waldemar";
        petSeller.lastName = "Padalski";
        petSeller.cash = 300.0;
        petSeller.pet = new Animal("Dog") {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        petSeller.pet.name = "Azor";

        Human petBuyer = new Human();
        petBuyer.firstName = "Adam";
        petBuyer.lastName = "Kowalski";
        petBuyer.cash = 2000.0;

        try {
            petSeller.pet.sell(petSeller, petBuyer, 1500.0);
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }

        System.out.println("Pieniądze sprzedającego: " + petSeller.cash);
        System.out.println("Pieniądze kupującego: " + petBuyer.cash);


        Human phoneSeller = new Human();
        phoneSeller.firstName = "Adrian";
        phoneSeller.cash = 360.0;
        phoneSeller.phone = new Phone("Samsung", "Galaxy", 2010);

        Human phoneBuyer = new Human();
        phoneBuyer.firstName = "Andrzej";
        phoneBuyer.cash = 600.0;
        try {
            phoneSeller.phone.sell(phoneSeller, phoneBuyer, 520.0);
        } catch (Exception b) {
            System.out.println(b.getMessage());
        }

        Human carBuyer = new Human();
        carBuyer.firstName = "Adam";
        carBuyer.lastName = "Kowalski";
        carBuyer.cash = 5000.0;

        try {
            carSeller.getCar().sell(carSeller, carBuyer, 2500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Animal swinka = new Animal("Pig") {
            @Override
            public void feed(Double foodWeight) {

            }
        };
        swinka.feed(3.0);
        swinka.beEaten();
    }
}


