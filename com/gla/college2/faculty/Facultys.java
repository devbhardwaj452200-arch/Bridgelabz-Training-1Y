package colleges.faculty;

public class Facultys {

    private String name;
    private String subject;
    private double salary;

    public Faculty(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Faculty Name: " + name +
                "\nSubject: " + subject +
                "\nSalary: " + salary;
    }
}