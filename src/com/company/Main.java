package com.company;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Lion");
        lion.name = "Brutus";

        Car smallCar = new Car("Ford", "Focus");
        smallCar.numberOfDoors = 5;
        smallCar.combustion = 12.0;

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Rosicki";
        me.pet = lion;
        me.car = smallCar;


        lion.feed();
        me.pet.feed();

        lion.takeForAWalk();
        me.pet.takeForAWalk();
    }
}
