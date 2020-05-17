package devices;

import creatures.Human;

public class Car extends Device {

    public int numberOfDoors;
    public Double combustion;
    private Double price;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car testCar = (Car) o;
        return model == testCar.model &&
                producer.equals(testCar.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("Auto właczone");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Brak wystarczających środków na kupno auta.");
        } else if (seller.getCar() != this) {
            throw new Exception("Sprzedawca nie posada auta.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(this);
            seller.setCar(null);
            System.out.println(buyer + " kupił od " + seller + this);
        }
    }
}



