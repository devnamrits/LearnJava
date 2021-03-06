package Inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employer;
    private char employeeGrade;
    private BigDecimal salary;

    //When we don't define a constructor then implicitly super()
    //with no arguments is called as constructor. Constructor of both
    // Employee and Person is called.
    Employee(String name){
        super(name);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ' ' + title + ' ' + employer + ' ' + employeeGrade;
    }
}
