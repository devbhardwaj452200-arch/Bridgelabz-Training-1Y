package colleges.student;

public class Student {

    private String name;
    private int rollNo;
    private String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student Name: " + name +
                "\nRoll No: " + rollNo +
                "\nCourse: " + course;
    }
}