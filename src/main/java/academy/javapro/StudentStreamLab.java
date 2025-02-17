package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class StudentStreamLab {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior"));

        List<Student> highGPAStudents = students.stream()
                .filter(student -> student.getGpa() > 3.0)
                .collect(Collectors.toList());

        List<String> highGPAStudentNames = students.stream()
                .filter(student -> student.getGpa() > 3.0)
                .map(Student::getName)
                .collect(Collectors.toList());

        double averageGPA = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        List<Student> juniorStudents = students.stream()
                .filter(student -> student.getCollegeYear().equals("Junior"))
                .collect(Collectors.toList());

        System.out.println("Students with GPA > 3.0:");
        for (Student student : highGPAStudents) {
            System.out.println(student);
        }

        System.out.println("\nHigh GPA student names:");
        for (String name : highGPAStudentNames) {
            System.out.println(name);
        }

        System.out.printf("\nAverage GPA: %.2f\n", averageGPA);

        System.out.println("\nJuniors:");
        for (Student student : juniorStudents) {
            System.out.println(student);
        }
    }
}
