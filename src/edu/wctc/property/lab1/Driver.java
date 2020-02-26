package edu.wctc.property.lab1;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Johnny", "Hall", "4639");
        employee1.setOrientationDate(LocalDate.of(2020, 3, 20));
        employee1.employeeOrientation();
        employee1.moveIn("1");
       employee1.printInformation();
    }
}
