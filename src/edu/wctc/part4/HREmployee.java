package edu.wctc.part4;

public class HREmployee {
    public Employee hireNewEmployee(String first, String last, String ssn){
        Employee employee = new Employee(first, last, ssn);
        orientEmployee(employee);
        return employee;
    }
    private void orientEmployee(Employee employee){
        employee.doFirstTimeOrientation("256D");
    }
}
