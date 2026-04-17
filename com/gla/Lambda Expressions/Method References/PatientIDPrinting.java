import java.util.*;

class Patient {
    int id;
    String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}

public class PatientIDPrinting {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient(101, "Amit"),
                new Patient(102, "Neha"),
                new Patient(103, "Ravi")
        );

        patients.stream()
                .map(Patient::getId)           // Method Reference
                .forEach(System.out::println); // Method Reference
    }
}
