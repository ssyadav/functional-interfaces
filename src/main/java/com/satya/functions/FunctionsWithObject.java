package com.satya.functions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
  String name;
  int salary;

  Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }
}

public class FunctionsWithObject {
  public static void main(String[] args) {

    List<Employee> employees =
        List.of(
            new Employee("John", 100000),
            new Employee("Jane", 150000),
            new Employee("Jack", 120000),
            new Employee("Jill", 130000));

    // write a function to calculate the bonus for each employee based on their salary
    // if salary is less than 120000, bonus is 25% of salary
    // if salary is greater than 120000 and less than 130000, bonus is 10% of salary
    // if salary is greater than 130000 and less than 150000 bonus is 15% of salary
    // if salary is greater than 150000 bonus is 10% of salary

    Function<Employee, Integer> calculateBonus =
        emp -> {
          if (emp.salary < 120000) {
            return emp.salary * 25 / 100;
          } else if (emp.salary < 130000) {
            return emp.salary * 20 / 100;
          } else if (emp.salary < 150000) {
            return emp.salary * 15 / 100;
          } else {
            return emp.salary * 10 / 100;
          }
        };

    Predicate<Integer> isBonusGreaterThan20000 = bonus -> bonus > 20000;
    employees.forEach(
        emp -> {
          // print only if employee bonus is greater than 20000
          int bonus = calculateBonus.apply(emp);
          if (isBonusGreaterThan20000.test(bonus)) {
            System.out.println(
                "Employee: " + emp.name + " Salary: " + emp.salary + " Bonus: " + bonus);
          }
        });
  }
}
