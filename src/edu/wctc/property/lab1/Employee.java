package edu.wctc.property.lab1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo
 * @version 1.02
 */
public class Employee {


    public String firstName;
    public String lastName;
    public String ssn;
    public boolean metWithHr;
    public boolean metDeptStaff;
    public boolean reviewedDeptPolicies;
    public boolean movedIn;
    public String cubeId;
    public LocalDate orientationDate;

    public Employee (String firstName, String lastName, String ssn) {
        if (firstName.equals("") || lastName.equals("") || ssn.equals("")) {
            throw new IllegalArgumentException("One or more of the following fields may be empty: Fist Name, Last Name and SSN");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        movedIn = false;
        reviewedDeptPolicies = false;
        cubeId = "";
        orientationDate = null;
        metWithHr = false;
        metDeptStaff = false;
    }

    public void setOrientationDate(LocalDate orientationDate) {
        if (orientationDate.compareTo(LocalDate.now()) < 0) {
            throw  new IllegalArgumentException("The date inputted was in the past");
        }
        this.orientationDate = orientationDate;
    }
    public  LocalDate getOrientationDate () {
        return orientationDate;
    }
  public void employeeOrientation () {
        reviewedDeptPolicies = true;
        metWithHr = true;
        metDeptStaff = true;
  }
  public String moveIn (String cubeId) {
        if (cubeId.equals("") || Integer.parseInt(cubeId) < 0) {
            throw new IllegalArgumentException("Please enter a cubeId that is valid");
        }
        movedIn = true;
        return this.cubeId = cubeId;
  }
  public void printInformation () {
      System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nSSN : " + ssn + "\nCubeID: " + cubeId);
  }
}
