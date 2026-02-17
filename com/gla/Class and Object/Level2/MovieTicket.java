// MovieTicket class
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Method to book ticket
    void bookTicket(String name, int seat, double ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket Booked Successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name  : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price       : " + price);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket();

        ticket1.bookTicket("Inception", 12, 250.0);
        ticket1.displayTicket();
    }
}
