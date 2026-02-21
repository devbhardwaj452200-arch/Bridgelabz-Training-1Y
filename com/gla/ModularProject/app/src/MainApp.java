import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ananya Singh", 101);

        System.out.println("---- Student Details ----");
        s1.displayStudent();
    }
}