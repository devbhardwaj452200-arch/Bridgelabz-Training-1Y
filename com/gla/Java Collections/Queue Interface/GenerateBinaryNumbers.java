import java.util.*;

public class GenerateBinaryNumbers {
    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Start with "1"
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll(); // remove front
            result.add(current);

            // Generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> binaries = generateBinary(n);

        System.out.println(binaries);
    }
}
