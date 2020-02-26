package edu.wctc.lab4;

public class Company {
    private HrPerson hrPerson;

    public Company() {
        hrPerson = new HrPerson();
    }


    public void hireEmployee(String firstname, String lastName, String ssn) {
        hrPerson.hireEmployee(firstname, lastName, ssn);
        hrPerson.outputOrientationReport(ssn);
    }
}
