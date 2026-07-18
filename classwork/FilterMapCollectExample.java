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

public class FilterMapCollectExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Sai", 75),
                new Student("Ravi", 55),
                new Student("Kiran", 85),
                new Student("Rahul", 45)
        );

        List<String> result = students.stream()
                .filter(s -> s.marks > 60)
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println("Students with marks above 60:");
        System.out.println(result);
    }
}
