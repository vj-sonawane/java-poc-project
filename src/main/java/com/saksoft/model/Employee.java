package com.saksoft.model;


import com.saksoft.constant.Departments;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
        private int id;
        private String name;
        private int age;
        private String department;
        private double salary;
        private LocalDate joiningDate;


        public static List<Employee> getEmployees() {
                return Arrays.asList(
                        Employee.builder().id(1).name("Sachin Tendulkar").age(30).department(Departments.HR).salary(50000).joiningDate(LocalDate.of(2010, 1, 15)).build(),
                        Employee.builder().id(2).name("Virat Kohli").age(25).department(Departments.FINANCE).salary(60000).joiningDate(LocalDate.of(2013, 3, 10)).build(),
                        Employee.builder().id(3).name("Rohit Sharma").age(35).department(Departments.IT).salary(75000).joiningDate(LocalDate.of(2008, 7, 25)).build(),
                        Employee.builder().id(4).name("MS Dhoni").age(28).department(Departments.HR).salary(52000).joiningDate(LocalDate.of(2012, 5, 18)).build(),
                        Employee.builder().id(5).name("Rahul Dravid").age(40).department(Departments.FINANCE).salary(80000).joiningDate(LocalDate.of(2006, 11, 12)).build(),
                        Employee.builder().id(6).name("Anil Kumble").age(50).department(Departments.IT).salary(95000).joiningDate(LocalDate.of(2004, 2, 20)).build(),
                        Employee.builder().id(7).name("Kapil Dev").age(45).department(Departments.HR).salary(70000).joiningDate(LocalDate.of(2003, 8, 5)).build(),
                        Employee.builder().id(8).name("Sourav Ganguly").age(32).department(Departments.FINANCE).salary(62000).joiningDate(LocalDate.of(2011, 4, 14)).build(),
                        Employee.builder().id(9).name("VVS Laxman").age(38).department(Departments.IT).salary(78000).joiningDate(LocalDate.of(2007, 10, 27)).build(),
                        Employee.builder().id(10).name("Yuvraj Singh").age(29).department(Departments.HR).salary(54000).joiningDate(LocalDate.of(2014, 1, 8)).build(),
                        Employee.builder().id(11).name("Harbhajan Singh").age(33).department(Departments.FINANCE).salary(61000).joiningDate(LocalDate.of(2009, 6, 3)).build(),
                        Employee.builder().id(12).name("Zaheer Khan").age(27).department(Departments.IT).salary(72000).joiningDate(LocalDate.of(2015, 12, 1)).build(),
                        Employee.builder().id(13).name("Gautam Gambhir").age(36).department(Departments.HR).salary(55000).joiningDate(LocalDate.of(2011, 9, 30)).build(),
                        Employee.builder().id(14).name("Ravindra Jadeja").age(42).department(Departments.FINANCE).salary(77000).joiningDate(LocalDate.of(2005, 3, 19)).build(),
                        Employee.builder().id(15).name("Shikhar Dhawan").age(39).department(Departments.IT).salary(85000).joiningDate(LocalDate.of(2008, 11, 23)).build(),
                        Employee.builder().id(16).name("Ajinkya Rahane").age(31).department(Departments.HR).salary(53000).joiningDate(LocalDate.of(2013, 7, 15)).build(),
                        Employee.builder().id(17).name("Jasprit Bumrah").age(48).department(Departments.FINANCE).salary(90000).joiningDate(LocalDate.of(2001, 5, 7)).build(),
                        Employee.builder().id(18).name("Bhuvneshwar Kumar").age(37).department(Departments.IT).salary(76000).joiningDate(LocalDate.of(2006, 10, 11)).build(),
                        Employee.builder().id(19).name("R Ashwin").age(34).department(Departments.HR).salary(62000).joiningDate(LocalDate.of(2009, 1, 29)).build(),
                        Employee.builder().id(20).name("Hardik Pandya").age(41).department(Departments.FINANCE).salary(81000).joiningDate(LocalDate.of(2002, 4, 2)).build(),
                        Employee.builder().id(21).name("KL Rahul").age(29).department(Departments.IT).salary(70000).joiningDate(LocalDate.of(2014, 8, 17)).build(),
                        Employee.builder().id(22).name("Mohammed Shami").age(38).department(Departments.HR).salary(66000).joiningDate(LocalDate.of(2007, 5, 26)).build(),
                        Employee.builder().id(23).name("Ishant Sharma").age(43).department(Departments.FINANCE).salary(88000).joiningDate(LocalDate.of(2000, 6, 9)).build(),
                        Employee.builder().id(24).name("Cheteshwar Pujara").age(44).department(Departments.IT).salary(92000).joiningDate(LocalDate.of(2001, 12, 13)).build(),
                        Employee.builder().id(25).name("Rishabh Pant").age(35).department(Departments.HR).salary(64000).joiningDate(LocalDate.of(2009, 7, 20)).build(),
                        Employee.builder().id(26).name("Suresh Raina").age(46).department(Departments.FINANCE).salary(83000).joiningDate(LocalDate.of(2003, 2, 18)).build(),
                        Employee.builder().id(27).name("Dinesh Karthik").age(47).department(Departments.IT).salary(87000).joiningDate(LocalDate.of(2002, 3, 24)).build(),
                        Employee.builder().id(28).name("Kedar Jadhav").age(30).department(Departments.HR).salary(58000).joiningDate(LocalDate.of(2015, 11, 30)).build(),
                        Employee.builder().id(29).name("Manish Pandey").age(32).department(Departments.FINANCE).salary(65000).joiningDate(LocalDate.of(2012, 6, 22)).build(),
                        Employee.builder().id(30).name("Yuzvendra Chahal").age(28).department(Departments.IT).salary(71000).joiningDate(LocalDate.of(2016, 1, 5)).build()
             );
        }

        public static List<List<Employee>> getNestedEmployees() {
                List<Employee> list1 = Arrays.asList(
                        Employee.builder().id(1).name("Sachin Tendulkar").age(30).department(Departments.HR).salary(50000).joiningDate(LocalDate.of(2010, 1, 15)).build(),
                        Employee.builder().id(2).name("Virat Kohli").age(25).department(Departments.FINANCE).salary(60000).joiningDate(LocalDate.of(2013, 3, 10)).build(),
                        Employee.builder().id(3).name("Rohit Sharma").age(35).department(Departments.IT).salary(75000).joiningDate(LocalDate.of(2008, 7, 25)).build()
                );

                List<Employee> list2 = Arrays.asList(
                        Employee.builder().id(4).name("MS Dhoni").age(28).department(Departments.HR).salary(52000).joiningDate(LocalDate.of(2012, 5, 18)).build(),
                        Employee.builder().id(5).name("Rahul Dravid").age(40).department(Departments.FINANCE).salary(80000).joiningDate(LocalDate.of(2006, 11, 12)).build(),
                        Employee.builder().id(6).name("Anil Kumble").age(50).department(Departments.IT).salary(95000).joiningDate(LocalDate.of(2004, 2, 20)).build()
                );

                List<Employee> list3 = Arrays.asList(
                        Employee.builder().id(7).name("Kapil Dev").age(45).department(Departments.HR).salary(70000).joiningDate(LocalDate.of(2003, 8, 5)).build(),
                        Employee.builder().id(8).name("Sourav Ganguly").age(32).department(Departments.FINANCE).salary(62000).joiningDate(LocalDate.of(2011, 4, 14)).build(),
                        Employee.builder().id(9).name("VVS Laxman").age(38).department(Departments.IT).salary(78000).joiningDate(LocalDate.of(2007, 10, 27)).build()
                );

                List<List<Employee>> nestedEmp = new ArrayList<>();
                nestedEmp.add(list1);
                nestedEmp.add(list2);
                nestedEmp.add(list3);

                return nestedEmp;
        }

}

