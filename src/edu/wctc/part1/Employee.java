package edu.wctc.part1;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
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

    public Employee(String firstName, String lastName, String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }
}
