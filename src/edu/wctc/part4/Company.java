package edu.wctc.part4;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private HREmployee hrGuy;
    private List<Employee> employees = new ArrayList<>();

    public Company(){hrGuy = new HREmployee();}
    public void newEmployee(String first, String last, String ssn){
        employees.add(hrGuy.hireNewEmployee(first, last, ssn));
    }
}
