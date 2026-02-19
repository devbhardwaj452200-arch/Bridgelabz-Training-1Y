// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation: getters and setters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method
    public abstract double calculateBill();
}

// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private String diagnosis; // sensitive data
    private final java.util.List<String> medicalHistory;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate, String diagnosis) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.diagnosis = diagnosis;
        this.medicalHistory = new java.util.ArrayList<>();
    }

    // Encapsulation
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        // Example billing: daily rate * days admitted + fixed service charges
        double serviceCharges = 500; // flat service charge
        return (dailyRate * daysAdmitted) + serviceCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
        } else {
            for (String record : medicalHistory) {
                System.out.println("- " + record);
            }
        }
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private int consultations;
    private double consultationFee;
    private String diagnosis; // sensitive
    private final java.util.List<String> medicalHistory;

    public OutPatient(String patientId, String name, int age, int consultations, double consultationFee, String diagnosis) {
        super(patientId, name, age);
        this.consultations = consultations;
        this.consultationFee = consultationFee;
        this.diagnosis = diagnosis;
        this.medicalHistory = new java.util.ArrayList<>();
    }

    // Encapsulation
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        // Billing: consultation fee * number of consultations + fixed charges
        double fixedCharges = 200; // flat fee
        return (consultationFee * consultations) + fixedCharges;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History for " + getName() + ":");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records available.");
        } else {
            for (String record : medicalHistory) {
                System.out.println("- " + record);
            }
        }
    }
}

// Main class to demonstrate polymorphism
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient inPatient = new InPatient("IP001", "Alice", 30, 5, 1500, "Pneumonia");
        OutPatient outPatient = new OutPatient("OP101", "Bob", 45, 3, 500, "Flu");

        // Adding medical records
        inPatient.addRecord("Admitted for Pneumonia treatment");
        inPatient.addRecord("Prescribed antibiotics for 7 days");

        outPatient.addRecord("Visited for Flu symptoms");
        outPatient.addRecord("Prescribed medication for 3 days");

        patients.add(inPatient);
        patients.add(outPatient);

        // Process patients polymorphically
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord medicalPatient) {
                medicalPatient.viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}
