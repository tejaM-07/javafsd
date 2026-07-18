import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Combine {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 75),
                new Student("Anu", 58),
                new Student("Kiran", 90),
                new Student("Sneha", 65),
                new Student("Ravi", 45)
        );

        List<String> names = students.stream()
                .filter(s -> s.marks > 60)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}