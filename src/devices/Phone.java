package devices;

import com.company.Human;

public class Phone extends Device {
    public Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon wlaczony");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Brak wystarczających środków na kupno telefonu.");
        } else if (seller.phone != this) {
            throw new Exception("Sprzedawca nie posada telefonu.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer + " kupił od " + seller + " " + buyer.phone);
    }
}



