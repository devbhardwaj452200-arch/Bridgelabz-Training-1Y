package colleges.department;

public class Department {

    private String deptName;
    private String hod;

    public Department(String deptName, String hod) {
        this.deptName = deptName;
        this.hod = hod;
    }

    @Override
    public String toString() {
        return "Department Name: " + deptName +
                "\nHOD: " + hod;
    }
}