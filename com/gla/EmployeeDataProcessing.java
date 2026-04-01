import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {

    public static void main(String[] args) {

        // Primitive int array (employee ages)
        int[] ages = {22, 45, 19, 34, 28, 41};

        // Convert int[] to ArrayList<Integer>
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            // Using wrapper class conversion (int -> Integer)
            ageList.add(Integer.valueOf(age));
        }

        // Find youngest and oldest ages
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        // Output
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }
}
