package devices;

public class Phone extends Device {
    public Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon wlaczony");
    }
}


