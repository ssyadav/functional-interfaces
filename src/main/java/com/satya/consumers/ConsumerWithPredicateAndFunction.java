package com.satya.consumers;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 1. Calculate the bonus for each employee based on their salary. - use Function<Employee, Integer>
 *      1. If salary is less than 120000, bonus is 20% of salary.
 *      2. If salary is greater than 120000 and less than 150000, bonus is 15% of salary.
 *      3. If salary is greater than 150000, bonus is 10% of salary.
 *  2. Print the employee name, salary, and bonus if the bonus is greater than 20000. - use Predicate<Integer> and Consumer<String>
 */
public class ConsumerWithPredicateAndFunction {

    public static void main(String[] args){

        // write a function to calculate the bonus for each employee based on their salary
        // if salary is less than 120000, bonus is 20% of salary
        // if salary is greater than 120000 and less than 150000, bonus is 15% of salary
        // if salary is greater than 150000 bonus is 10% of salary

        Function<Employee, Integer> calculateBonus = emp -> {
            if(emp.salary < 120000){
                return emp.salary * 20 / 100;
            } else if(emp.salary < 150000){
                return emp.salary * 15 / 100;
            } else {
                return emp.salary * 10 / 100;
            }
        };

        // Predicate to check if the bonus is greater than 20000
        Predicate<Integer> isBonusGreaterThan20000 = bonus -> bonus > 20000;

        // Consumer to print the employee name, salary, and bonus
        Consumer<Employee> printEmployee = emp -> System.out.println("Employee: " + emp.name + " Salary: " + emp.salary);

        // let's create a list of employees
        List<Employee> employees = List.of(
            new Employee("John", 100000),
            new Employee("Jane", 250000),
            new Employee("Jack", 300000),
            new Employee("Jill", 130000)
        );

    // let's calculate the bonus for each employee and print the employee name, salary, and bonus if
    // the bonus is greater than 20000
    // use Function, Predicate and Consumer
    employees.forEach(
        emp -> {
          int bonus = calculateBonus.apply(emp) ;
          if (isBonusGreaterThan20000.test(bonus)) {
            printEmployee.accept(emp);
            System.out.println("Bonus: " + bonus);
          }
        });
    }

}


class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}