package creatures;

import devices.Car;
import devices.Phone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car car;
    private Double salary = 2000.0;
    public Double cash = 0.0;

    public Human() {
        super("homo sapiens");
    }

    public Double getSalary() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        System.out.println("Data pobrania wartości o wypłacie: " + date + " i ilość: " + this.salary);
        return this.salary;
    }

    public boolean setSalary(Double value) {
        if (salary < 0) {
            System.out.println("Podano błędną wartość.");
            return false;
        } else {
            System.out.println("Pomyślnie zostały wysłane dane do działu księgowości.");
            System.out.println("Prosimy o odebranie aneksu do umowy od pani Hani z kadr.");
            System.out.println("Uprzejmie informujemy że ZUS i US zostały poinformowanie o zmianie wypłaty i upominamy o nie ukrywaniu dochodu.");
            this.salary = value;
            return true;
        }
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean buyCar(Car car) {
        if (this.salary > car.getPrice()) {
            System.out.println("Kupiono autko.");
            return true;
        } else if (this.salary > car.getPrice() / 12.0) {
            System.out.println("Na kredyt też spoko.");
            return true;
        } else {
            System.out.println("Mordo widzę że krucho z kasą.");
            return false;
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Błąd");
    }


    @Override
    public void feed(Double foodWeight) {

    }

}



