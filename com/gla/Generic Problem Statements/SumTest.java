import java.util.*;

// Utility class
class NumberUtils {

    // Generic method using wildcard
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;

        for (Number num : list) {
            sum += num.doubleValue(); // Convert to double for addition
        }

        return sum;
    }
}

// Test class
public class SumTest {
    public static void main(String[] args) {

        // Integer list
        List<Integer> intList = Arrays.asList(10, 20, 30);
        System.out.println("Sum of Integers: " + NumberUtils.sumNumbers(intList));

        // Double list
        List<Double> doubleList = Arrays.asList(5.5, 2.5, 7.0);
        System.out.println("Sum of Doubles: " + NumberUtils.sumNumbers(doubleList));
    }
}
