package edu.wctc.lab4.solution.withinput;


public class Startup {
    public static void main(String[] args) {
        Company company = new Company();

        // Startup delegates work to Company which then delegates work to HRManager
        company.hireEmployee();
    }
}
