package com.saksoft.interviews;

import com.saksoft.exceptions.EmployeeNotFoundException;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgemini {
    public static void main(String[] args) throws EmployeeNotFoundException {
        Infosys infosys = new Infosys();

        System.out.println("Capgemini L1: 28th-May-2024");
        String city = "AURANGABAD";
        //Required Output: {A=4, B=1, R=1, D=1, U=1, G=1, N=1}
        Map<String, Long> count =
                Arrays.stream(city.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output: "+count);

        System.out.println(infosys.getEmployeeById(31));
    }
}
