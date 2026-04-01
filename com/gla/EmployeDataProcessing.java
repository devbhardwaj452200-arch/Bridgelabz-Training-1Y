import java.util.ArrayList;
import java.util.Collections;

public class EmployeDataProcessing {

    public static void main(String[] args) {

        // Primitive int array (employee ages)
        int[] agesArray = {25, 32, 19, 45, 28, 21};

        // Convert int[] to ArrayList<Integer>
        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : agesArray) {
            // Autoboxing (int -> Integer using wrapper class)
            ageList.add(Integer.valueOf(age));
        }

        // Find youngest and oldest ages
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        // Output results
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }
}
