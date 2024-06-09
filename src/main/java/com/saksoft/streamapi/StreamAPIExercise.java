package com.saksoft.streamapi;

import com.saksoft.model.Employee;
import com.saksoft.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExercise {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        List<List<Employee>> nestedEmployees = Employee.getNestedEmployees();
        List<Student> students = Student.getStudents();

        nestedEmployees.stream()
                        .flatMap(List::stream)
                                .toList()
                                        .forEach(System.out::println);

        System.out.print("Highest paid employee: ");
        Employee first = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No employee found."));
        System.out.println(first);

        System.out.print("Youngest employee in the organisation: ");
        Employee young = employees.stream()
                .min(Comparator.comparingInt(Employee::getAge))
                .orElseThrow(() -> new RuntimeException("EmployeeNotFoundException"));
        System.out.println(young);

        System.out.print("Employee with second highest salary: ");
        List<Employee> second = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .toList();
        System.out.println(second);

        System.out.print("Employee with third highest salary: ");
        List<Employee> third = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .skip(2)
                .toList();
        System.out.println(third);

        System.out.println("Top three highest paid employees: ");
        employees.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(3)
                        .forEach(System.out::println);

        System.out.print("Second highest salary: ");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .forEach(emp-> System.out.println(emp.getSalary()));

        System.out.println("Number of employees in each dept: ");
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .forEach((dept,count)-> System.out.println(dept+": "+count));

        List<Student> list = students.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .skip(2)
                .toList();
        System.out.println(list);

        Student student = students.stream()
                .min(Comparator.comparingDouble(Student::getAge))
                .orElseThrow(() -> new RuntimeException("ERR"));
        System.out.println(student);


    }
}
