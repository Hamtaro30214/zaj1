package com.company;

import java.io.File;

public class Animal implements Sellable {
    final String species;
    String name;
    File pic;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species == "Dod") {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Zakaz handlu ludźmi.");
        } else {
            if (buyer.cash < price) {
                throw new Exception("Brak wystarczających środków na kupno zwierzaka.");
            }
            if (seller.pet != this) {
                throw new Exception("Sprzedawca nie posida zwierzaka.");
            }
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println(buyer.firstName + " kupił od " + seller.firstName + " " + buyer.pet);
        }
    }
}



