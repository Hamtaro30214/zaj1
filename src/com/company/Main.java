package com.company;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal("Lion");
        lion.name = "Brutus";

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Rosicki";
        me.pet = lion;

        lion.feed();
        me.pet.feed();

        lion.takeForAWalk();
        me.pet.takeForAWalk();
    }
}
