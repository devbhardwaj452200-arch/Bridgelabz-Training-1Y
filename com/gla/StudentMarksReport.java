import java.util.ArrayList;

public class StudentMarksReport {

    public static void main(String[] args) {

        // Mixed inputs (String, Integer, invalid, "null")
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", 76};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object input : inputs) {

            try {
                if (input instanceof String) {
                    String str = (String) input;

                    // Ignore "null" string
                    if (str.equalsIgnoreCase("null")) {
                        continue;
                    }

                    // Convert String to Integer
                    validMarks.add(Integer.parseInt(str));

                } else if (input instanceof Integer) {
                    // Already Integer
                    validMarks.add((Integer) input);
                }

            } catch (NumberFormatException e) {
                // Ignore invalid entries like "abc"
                System.out.println("Invalid input skipped: " + input);
            }
        }

        // Calculate average
        int sum = 0;
        for (int mark : validMarks) {
            sum += mark; // auto-unboxing
        }

        double average = 0.0;
        if (!validMarks.isEmpty()) {
            average = (double) sum / validMarks.size();
        }

        // Output
        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }
}
