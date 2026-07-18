import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

class Hmarks {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 75),
                new Student("Anu", 58),
                new Student("Kiran", 90),
                new Student("Sneha", 65),
                new Student("Ravi", 45)
        );

        Student highest = students.stream()
                .max(Comparator.comparing(s -> s.marks))
                .orElse(null);

        System.out.println(highest);
    }
}