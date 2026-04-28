import java.util.*;

// Student class
class Student {
    int id;
    String name;
    ArrayList<String> courses;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new ArrayList<>();
    }
}

// Main class
public class CollegeCourseSystem {

    static HashMap<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- College Course Registration System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Register Course");
            System.out.println("3. View Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    if (students.containsKey(id)) {
                        System.out.println("Student already exists!");
                    } else {
                        students.put(id, new Student(id, name));
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    if (students.containsKey(sid)) {
                        System.out.print("Enter Course Name: ");
                        String course = sc.nextLine();

                        students.get(sid).courses.add(course);
                        System.out.println("Course registered successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int vid = sc.nextInt();

                    if (students.containsKey(vid)) {
                        Student s = students.get(vid);

                        System.out.println("Student Name: " + s.name);

                        if (s.courses.isEmpty()) {
                            System.out.println("No courses registered.");
                        } else {
                            System.out.println("Registered Courses: " + s.courses);
                        }
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
