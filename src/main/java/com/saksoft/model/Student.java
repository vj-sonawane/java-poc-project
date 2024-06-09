package com.saksoft.model;

import com.saksoft.constant.Subjects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int rollNo;
    private String name;
    private int age;
    private double percentage;
    private String subject;

    public static List<Student> getStudents() {
        return Arrays.asList(
                new Student(1, "Aarav Patil", 20, 85.5, Subjects.COMPUTER_SCIENCE),
                new Student(2, "Vihaan Deshmukh", 21, 88.0, Subjects.MATHEMATICS),
                new Student(3, "Vivaan Joshi", 22, 91.2, Subjects.PHYSICS),
                new Student(4, "Ananya Kulkarni", 20, 84.3, Subjects.ENGINEERING),
                new Student(5, "Aditya Shinde", 23, 79.5, Subjects.BIOLOGY),
                new Student(6, "Riya Pawar", 21, 94.7, Subjects.COMPUTER_SCIENCE),
                new Student(7, "Aryan Rao", 20, 76.4, Subjects.MATHEMATICS),
                new Student(8, "Isha Jadhav", 22, 89.8, Subjects.PHYSICS),
                new Student(9, "Ayaan Gadgil", 23, 92.1, Subjects.ENGINEERING),
                new Student(10, "Meera Naik", 21, 87.5, Subjects.BIOLOGY),
                new Student(11, "Siddharth Bhosale", 20, 81.6, Subjects.COMPUTER_SCIENCE),
                new Student(12, "Anvi Bhagat", 22, 93.3, Subjects.MATHEMATICS),
                new Student(13, "Atharv Rane", 21, 85.0, Subjects.PHYSICS),
                new Student(14, "Neha Dhawan", 20, 90.2, Subjects.ENGINEERING),
                new Student(15, "Arjun Gaikwad", 23, 83.7, Subjects.BIOLOGY),
                new Student(16, "Rohit Salvi", 21, 88.9, Subjects.COMPUTER_SCIENCE),
                new Student(17, "Nikhil Chaudhari", 20, 78.2, Subjects.MATHEMATICS),
                new Student(18, "Aaryan Kothari", 22, 91.5, Subjects.PHYSICS),
                new Student(19, "Pooja Phadke", 23, 95.0, Subjects.ENGINEERING),
                new Student(20, "Tanvi Desai", 21, 87.8, Subjects.BIOLOGY),
                new Student(21, "Ayush Dhumal", 20, 80.4, Subjects.COMPUTER_SCIENCE),
                new Student(22, "Karan Apte", 22, 92.6, Subjects.MATHEMATICS),
                new Student(23, "Arya Kane", 21, 84.9, Subjects.PHYSICS),
                new Student(24, "Ansh Malhotra", 20, 89.1, Subjects.ENGINEERING),
                new Student(25, "Aria Pandit", 23, 82.3, Subjects.BIOLOGY),
                new Student(26, "Avi Mehta", 21, 86.4, Subjects.COMPUTER_SCIENCE),
                new Student(27, "Anvay Thakur", 20, 79.7, Subjects.MATHEMATICS),
                new Student(28, "Anshul Gokhale", 22, 90.8, Subjects.PHYSICS),
                new Student(29, "Aayush Mahajan", 23, 88.5, Subjects.ENGINEERING),
                new Student(30, "Arnav Chavan", 21, 83.1, Subjects.BIOLOGY)
        );
    }
}
