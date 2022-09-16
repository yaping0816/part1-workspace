package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

  private double salary;

  public SalariedEmployee() {
  }

  @Override
  public void pay() {
    System.out.printf("%s is paid salary %.2f.\n", getName(), getSalary());
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

  @Override
  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), SALARIED_TAX_RATE * getSalary());
  }
}
