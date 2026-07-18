class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {
        // Sample student data
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 78),
            new Student("David", 95),
            new Student("Eva", 88)
        };

        Student topStudent = students[0]; // assume first student is top initially

        for (Student s : students) {
            if (s.marks > topStudent.marks) {
                topStudent = s;
            }
        }

        System.out.println("Student with highest marks: " + topStudent.name);
        System.out.println("Marks: " + topStudent.marks);
    }
}
