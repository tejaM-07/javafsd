import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class MapExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Sai", 75),
                new Student("Ravi", 60),
                new Student("Kiran", 85)
        );

        List<String> names = students.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println("Student Names:");
        System.out.println(names);
    }
}
