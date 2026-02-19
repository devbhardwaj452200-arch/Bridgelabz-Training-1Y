import java.io.*;

// Class marked for backup
class Employee implements Serializable {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class BackupSystem {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Rahul");

        // Check if object is marked Serializable
        if (emp instanceof Serializable) {
            System.out.println("Employee is eligible for backup.");
        } else {
            System.out.println("Employee is NOT eligible for backup.");
        }
    }
}
