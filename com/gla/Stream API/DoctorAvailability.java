import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public boolean isAvailableOnWeekend() { return availableOnWeekend; }
    public String getSpecialty() { return specialty; }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true),
                new Doctor("Dr. D", "Dermatology", true)
        );

        doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .forEach(System.out::println);
    }
}
