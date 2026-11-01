import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }
}

class EnrollmentDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Dieudonné", 25);
        Course course = new Course("JAVA101", "Java Programming", "Prof. Virtanen");
        Enrollment enrollment = new Enrollment(student, course, "10.11.2026");

        // Serialize
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            out.writeObject(enrollment);
            System.out.println("Enrollment saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            Enrollment loaded = (Enrollment) in.readObject();
            System.out.println("Student: " + loaded.getStudent().getName());
            System.out.println("Course: " + loaded.getCourse().getCourseName());
            System.out.println("Date: " + loaded.getEnrollmentDate());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}