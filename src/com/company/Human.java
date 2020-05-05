package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;

    public Double getSalary() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        Date date = new Date();
        System.out.println("Data pobrania wartości o wypłacie: " + date + " i ilość: " + this.salary);
        return this.salary;
    }

    public boolean setSalary(Double value) {
        if (salary < 0) {
            System.out.println("Podano błędną wartość.");
        } else {
            System.out.println("Pomyślnie zostały wysłane dane do działu księgowości.");
            System.out.println("Prosimy o odebranie aneksu do umowy od pani Hani z kadr.");
            System.out.println("Uprzejmie informujemy że ZUS i US zostały poinformowanie o zmianie wypłaty i upominamy o nie ukrywaniu dochodu.");
            this.salary = value;
        }
        return true;
    }
}
