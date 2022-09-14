package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double salary;

  public SalariedEmployee() {
  }


  public void setSalary(double salary) {
    this.salary = salary;
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }
  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);
  }

  public double getSalary() {
    return salary;
  }

  @Override
  public String toString() {
//    return super.toString()+", salary=" + salary;
    return String.format("%s, salary=%,.2f", super.toString(), getSalary());
//    return "Employee: name=" + getName() + ", hireDate=" + getHireDate()+ "salary="+getSalary();
  }
}
