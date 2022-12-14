package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee
    implements TaxPayer {

  private double rate;
  private double hours;
  public static final double DEFAULT_STANDARD_DEDUCTION = 1000.0;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  @Override
  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(),(getHours()*getRate()));
//    System.out.println("someone get paid in hourly");
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
//    return "Employee: name=" + getName() + ", hireDate=" + getHireDate()+ "rate="+getRate() + "hours=" + getHours();
    return String.format("%s, rate=%.2f, hours=%.1f", super.toString(),getRate(), getHours());
  }

  @Override
  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), HOURLY_TAX_RATE * getHours());
  }

  @Override
  public double getStandardDeduction() {
    return DEFAULT_STANDARD_DEDUCTION;
  }
  // TODO: 9/13/22 declare and implement a constructor that takes name,hireDate, rate and hours as parameter
  // TODO: 9/13/22 generate setters and getters for rate and hour 
  // TODO: 9/13/22 override toString 
}
