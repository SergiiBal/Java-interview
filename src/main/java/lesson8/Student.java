package lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int grade;

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 65),
                new Student("Mary", 76),
                new Student("Steve", 85),
                new Student("Rachel", 92),
                new Student("Mike", 70),
                new Student("Emma", 88)
        );

        List<Student> listOfStudents = students.stream()
                .sorted((s1, s2) -> s2.grade - s1.grade)
                .filter(studentGrage -> studentGrage.grade > 70)
                .collect(Collectors.toList());
        listOfStudents.forEach(student -> System.out.println(student.getName() + " + " + student.getGrade()));

        double averageGrade = students.stream()
                .collect(Collectors.averagingDouble(Student::getGrade));
        System.out.println("Average grade of all students = " + averageGrade);

        Map<String, Integer> mapOfStudents = listOfStudents.stream()
                .collect(Collectors.toMap(Student::getName, Student::getGrade));
        System.out.println("Emma's grade is " + mapOfStudents.get("Emma"));
    }


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}