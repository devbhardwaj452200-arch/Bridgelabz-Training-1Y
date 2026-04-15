import java.util.*;

public class AttendanceTracker {

    public static void main(String[] args) {

        // Step 1: Initialize students with 0 attendance
        Map<String, Integer> attendance = new HashMap<>();

        attendance.put("Aman", 0);
        attendance.put("Riya", 0);
        attendance.put("Karan", 0);
        attendance.put("Sneha", 0);
        attendance.put("Rahul", 0);

        // Step 2: Simulate 15 days attendance
        List<List<String>> monthlyAttendance = Arrays.asList(
                Arrays.asList("Aman", "Riya", "Karan"),
                Arrays.asList("Aman", "Sneha"),
                Arrays.asList("Riya", "Rahul"),
                Arrays.asList("Aman", "Riya", "Sneha"),
                Arrays.asList("Karan", "Rahul"),
                Arrays.asList("Aman", "Riya"),
                Arrays.asList("Sneha", "Rahul"),
                Arrays.asList("Aman", "Karan"),
                Arrays.asList("Riya", "Sneha"),
                Arrays.asList("Aman", "Rahul"),
                Arrays.asList("Karan", "Sneha"),
                Arrays.asList("Aman", "Riya", "Rahul"),
                Arrays.asList("Sneha"),
                Arrays.asList("Aman", "Karan", "Rahul"),
                Arrays.asList("Riya", "Sneha")
        );

        // Update attendance count
        for (List<String> dailyList : monthlyAttendance) {
            for (String student : dailyList) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        // Print total attendance
        System.out.println("Total Attendance:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 3: Find students below threshold
        int threshold = 10;
        System.out.println("\nStudents with attendance less than " + threshold + ":");

        boolean found = false;
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}
