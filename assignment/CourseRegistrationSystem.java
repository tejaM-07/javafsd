import java.util.ArrayList;

class Course {

    
    private String courseCode;
    private String courseName;
    private int courseCredits;

    
    public Course(String courseCode, String courseName, int courseCredits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    
    public void displayCourse() {

        System.out.println("----------------------------");
        System.out.println("Course Code    : " + courseCode);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Course Credits : " + courseCredits);
    }
}


public class CourseRegistrationSystem {

    
    private ArrayList<Course> courses = new ArrayList<>();


    
    public void addCourse(Course course) {

        for (Course c : courses) {

            if (c.getCourseCode().equalsIgnoreCase(course.getCourseCode())) {

                System.out.println("Course already exists.");
                return;
            }
        }

        courses.add(course);
        System.out.println(course.getCourseName() + " added successfully.");
    }


    
    public void removeCourse(String courseCode) {

        for (int i = 0; i < courses.size(); i++) {

            if (courses.get(i).getCourseCode().equalsIgnoreCase(courseCode)) {

                System.out.println(courses.get(i).getCourseName()
                        + " removed successfully.");

                courses.remove(i);
                return;
            }
        }

        System.out.println("Course not found.");
    }


    
    public void findCourse(String courseCode) {

        for (Course c : courses) {

            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {

                System.out.println("\nCourse Found");
                c.displayCourse();
                return;
            }
        }

        System.out.println("Course not found.");
    }


    
    public void updateCourse(String courseCode, String newName, int newCredits) {

        for (Course c : courses) {

            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {

                c.setCourseName(newName);
                c.setCourseCredits(newCredits);

                System.out.println("Course updated successfully.");
                return;
            }
        }

        System.out.println("Course not found.");
    }


    
    public void showCourses() {

        System.out.println("\n===== Registered Courses =====");

        if (courses.isEmpty()) {

            System.out.println("No courses registered.");
            return;
        }


        for (Course c : courses) {

            c.displayCourse();
        }
    }


    
    public void calculateTotalCredits() {

        int totalCredits = 0;


        for (Course c : courses) {

            totalCredits += c.getCourseCredits();
        }


        System.out.println("\nTotal Credits = " + totalCredits);
    }



    
    public static void main(String[] args) {


        CourseRegistrationSystem system = new CourseRegistrationSystem();


        
        Course c1 = new Course("CS101", "Java Programming", 4);
        Course c2 = new Course("CS102", "Python Programming", 3);
        Course c3 = new Course("CS103", "Database Management", 4);
        Course c4 = new Course("CS104", "Web Development", 3);


        // Adding Courses
        system.addCourse(c1);
        system.addCourse(c2);
        system.addCourse(c3);


        // Display Courses
        system.showCourses();


        // Add New Course
        System.out.println("\nAdding New Course...");
        system.addCourse(c4);


        // Display Again
        system.showCourses();



        // Search Course
        System.out.println("\nSearching Course CS102");
        system.findCourse("CS102");



        // Update Course
        System.out.println("\nUpdating Course CS103");

        system.updateCourse(
                "CS103",
                "Advanced Database Management",
                5
        );



        // Display Updated List
        system.showCourses();



        // Remove Course
        System.out.println("\nRemoving Course CS101");

        system.removeCourse("CS101");



        // Display Remaining Courses
        system.showCourses();



        // Total Credits
        system.calculateTotalCredits();
    }
}