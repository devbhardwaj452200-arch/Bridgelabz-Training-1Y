import java.util.*;

public class ExamResults {

    public static void main(String[] args) {

        // Main Map: subject -> (student -> marks)
        Map<String, Map<String, Integer>> data = new HashMap<>();

        // Step 1: Add data
        addMarks(data, "Math", "Aman", 95);
        addMarks(data, "Math", "Riya", 88);
        addMarks(data, "Math", "Karan", 76);

        addMarks(data, "Science", "Aman", 85);
        addMarks(data, "Science", "Riya", 92);
        addMarks(data, "Science", "Karan", 89);

        addMarks(data, "English", "Aman", 78);
        addMarks(data, "English", "Riya", 81);
        addMarks(data, "English", "Karan", 91);

        // Step 2: Topper per subject
        System.out.println("Topper per Subject:");
        for (String subject : data.keySet()) {
            Map<String, Integer> students = data.get(subject);

            String topper = "";
            int maxMarks = 0;

            for (Map.Entry<String, Integer> entry : students.entrySet()) {
                if (entry.getValue() > maxMarks) {
                    maxMarks = entry.getValue();
                    topper = entry.getKey();
                }
            }

            System.out.println(subject + " -> " + topper + " (" + maxMarks + ")");
        }

        // Step 3: Average per subject
        System.out.println("\nAverage Marks per Subject:");
        for (String subject : data.keySet()) {
            Map<String, Integer> students = data.get(subject);

            int sum = 0;
            for (int marks : students.values()) {
                sum += marks;
            }

            double avg = (double) sum / students.size();
            System.out.println(subject + " -> " + avg);
        }

        // Step 4: Subjects with at least one score > 90
        System.out.println("\nSubjects with at least one student scoring above 90:");

        for (String subject : data.keySet()) {
            Map<String, Integer> students = data.get(subject);

            boolean found = false;
            for (int marks : students.values()) {
                if (marks > 90) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(subject);
            }
        }
    }

    // Helper method to add marks
    public static void addMarks(Map<String, Map<String, Integer>> data,
                                String subject, String student, int marks) {

        // If subject not present, create new map
        data.putIfAbsent(subject, new HashMap<>());

        // Add student marks
        data.get(subject).put(student, marks);
    }
}
