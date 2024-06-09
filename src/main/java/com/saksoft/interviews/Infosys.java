package com.saksoft.interviews;

import com.saksoft.exceptions.EmployeeNotFoundException;
import com.saksoft.model.Employee;

import java.util.*;
import java.util.List;

import static java.util.Arrays.stream;

public class Infosys {
    public static void main(String[] args) {
        //Ex.1: Remove Duplicates from String
        String city = "AURANGABAD";
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : city.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
                }
            }
        System.out.println("LinkedHashSet: "+set);
        System.out.println("StringBuilder: "+result.toString());

        //Ex.2: Fetch the employee from List<List<Employee>>
        Employee.getNestedEmployees()
                .stream()
                .flatMap(List::stream)
                .toList()
                .forEach(System.out::println);

        //Ex.3: Sort the employee on the basis of their joining date
        Employee.getEmployees()
                .stream()
                .sorted(Comparator.comparing(Employee::getJoiningDate).reversed())
                .toList()
                .forEach(System.out::println);
        }
        public Employee getEmployeeById(int id) throws EmployeeNotFoundException{
        //Ex.4: Create a custom exception and use it
        return
                Employee.getEmployees()
                        .stream()
                        .filter(employee -> employee.getId() == id)
                        .findFirst()
                        .orElseThrow(() -> new EmployeeNotFoundException("No employee present in DB with this id: "+id));
        }

    }
