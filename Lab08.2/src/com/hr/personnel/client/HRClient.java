/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));

        dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));

        // TODO: 9/13/22 create at least 1 hourlyEmployee and 1 SalariedEmployee, passing to the addEmployee method.

        HourlyEmployee employee1 = new HourlyEmployee("Yaping", LocalDate.now(), 53.21, 40);
        dept.addEmployee(employee1);
        System.out.println(employee1);
        employee1.pay();

        Employee employee2 = new SalariedEmployee("yaya", LocalDate.now(), 6000);
        dept.addEmployee(employee2);

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay employees: ");

        dept.payEmployees();

    }
}