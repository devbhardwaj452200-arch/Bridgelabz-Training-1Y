import java.util.*;

public class ReverseArrayList {
    public static <T> void reverseList(ArrayList<T> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        reverseList(list);

        System.out.println(list); // Output: [5, 4, 3, 2, 1]
    }
}
