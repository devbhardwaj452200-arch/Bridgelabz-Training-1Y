import java.util.*;

// Abstract base class
abstract class CourseType {
    String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public abstract void evaluate();
}

// Exam-based course
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated by exams.");
    }
}

// Assignment-based course
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated by assignments.");
    }
}

// Research-based course
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    public void evaluate() {
        System.out.println(courseName + " evaluated by research work.");
    }
}

// Generic Course class
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    // Add course
    public void addCourse(T course) {
        courses.add(course);
    }

    // Get all courses
    public List<T> getCourses() {
        return courses;
    }
}

// Utility class for wildcard handling
class CourseDisplay {

    // Wildcard method
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}

// Test class
public class UniversityTest {
    public static void main(String[] args) {

        // Exam courses
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        // Assignment courses
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("English"));
        assignmentCourses.addCourse(new AssignmentCourse("History"));

        // Research courses
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("Data Science"));

        // Display all courses
        System.out.println("Exam Courses:");
        CourseDisplay.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        CourseDisplay.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        CourseDisplay.displayCourses(researchCourses.getCourses());
    }
}
