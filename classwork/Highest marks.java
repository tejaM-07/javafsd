import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class HighestMarksExample {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Sai", 75),
                new Student("Ravi", 55),
                new Student("Kiran", 90),
                new Student("Rahul", 80)
        );

        Student topStudent = students.stream()
                .max(Comparator.comparingInt(s -> s.marks))
                .get();

        System.out.println("Highest Marks Student:");
        System.out.println(topStudent.name + " - " + topStudent.marks);
    }
}