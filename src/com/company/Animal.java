package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species eq "Dod"){
            weight = 10.0;
        } else if (species == "Lion") {
            weight = 190.0;
        } else {
            weight = 1.0;
        }
    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("Nie można nakarmić martwego zwierzaka.");
        } else {
            weight++;
            System.out.println("Waga zwierzaka: " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("Nie można iść na spacer z martwym zwierzakiem.");
        } else {
            weight -= 0.1;
            System.out.println("Udany spacer: " + weight);
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", species='" + species + '\'' + ", weight=" + weight + '}';
    }
}


