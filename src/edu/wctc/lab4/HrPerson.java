package edu.wctc.lab4;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class HrPerson {
    private List<Employee> employeeList;
    public HrPerson() {
        employeeList = new ArrayList<>();
    }
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee emp = new Employee(firstName,lastName,ssn);
        orientateEmployee(emp);
        employeeList.add(emp);

    }
    public void orientateEmployee (Employee emp) {
        String cubeID = assigncubeId();
        emp.doFirstTimeOrientation(cubeID);
    }
    public String assigncubeId () {
        String assignedCubeID = JOptionPane.showInputDialog("Enter the cube ID");
        return assignedCubeID;
    }
    public void outputOrientationReport(String ssn) {

        // find employee in list
        for (Employee emp : employeeList) {
            if (emp.getSsn().equals(ssn)) {
                // if found run report
                if (emp.hasMetWithHr() && emp.hasMetDeptStaff()
                        && emp.hasReviewedDeptPolicies() && emp.hasMovedIn()) {
                    emp.printReport();
                }
                break;
            }
        }
    }

}
