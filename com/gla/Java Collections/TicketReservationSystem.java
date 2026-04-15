import java.util.*;

// Booking class
class Booking implements Comparable<Booking> {
    String user;
    boolean isVIP;
    int ticketId;

    public Booking(String user, boolean isVIP, int ticketId) {
        this.user = user;
        this.isVIP = isVIP;
        this.ticketId = ticketId;
    }

    // Priority: VIP first
    @Override
    public int compareTo(Booking other) {
        if (this.isVIP && !other.isVIP) return -1;
        if (!this.isVIP && other.isVIP) return 1;
        return this.ticketId - other.ticketId; // FIFO within same type
    }

    @Override
    public String toString() {
        return user + " (Ticket " + ticketId + ", " + (isVIP ? "VIP" : "Regular") + ")";
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {

        // 1. Register users (Set → no duplicates)
        Set<String> users = new HashSet<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("Alice"); // duplicate

        System.out.println("Registered Users: " + users);

        // 2. Queue booking requests (FIFO)
        Queue<Booking> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Booking("Alice", false, 1));
        bookingQueue.add(new Booking("Bob", true, 2));     // VIP
        bookingQueue.add(new Booking("Charlie", false, 3));

        // 3. PriorityQueue for VIP handling
        PriorityQueue<Booking> priorityQueue = new PriorityQueue<>();

        // Move all bookings into priority queue
        while (!bookingQueue.isEmpty()) {
            priorityQueue.add(bookingQueue.poll());
        }

        // 4. Confirm bookings (store in List)
        List<Booking> confirmedBookings = new ArrayList<>();

        while (!priorityQueue.isEmpty()) {
            Booking b = priorityQueue.poll(); // VIP first
            confirmedBookings.add(b);
        }

        // Output
        System.out.println("\nConfirmed Bookings (VIP first):");
        for (Booking b : confirmedBookings) {
            System.out.println(b);
        }
    }
}
