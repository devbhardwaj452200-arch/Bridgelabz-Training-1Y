import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || n <= 0) {
            return null;
        }

        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        // Move first pointer N steps ahead
        int count = 0;
        while (count < n) {
            if (!first.hasNext()) {
                return null; // N is greater than list size
            }
            first.next();
            count++;
        }

        // Move both pointers until first reaches end
        T result = null;
        while (first.hasNext()) {
            first.next();
            result = second.next();
        }

        // If N equals size, second hasn't moved yet
        if (result == null && second.hasNext()) {
            result = second.next();
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        String result = findNthFromEnd(list, n);

        System.out.println("Nth element from end: " + result);
    }
}
