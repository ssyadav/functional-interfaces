package com.satya.predicates;

import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    int experience;

    public Employee(String name, int salary, int experience){
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}


public class PredicatesWithObjectDemo {

    public static void main(String[] args){
        //  Predicate to check if an employee salary is greater than 30000 and experience is greater than 3 years
        Predicate<Employee> isEligibleForPromotion = employee -> employee.salary <= 30000 && employee.experience >= 3;

        List<Employee> employees = List.of(
                new Employee("Satya", 40000, 4),
                new Employee("John", 20000, 2),
                new Employee("Doe", 50000, 5),
                new Employee("Smith", 30000, 3)
        );

        for(Employee employee : employees){
            if(isEligibleForPromotion.test(employee)){
                System.out.println(employee.name + " is eligible for promotion");
            }
        }

    }
}
