import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price +
                " | Rating: " + rating +
                " | Discount: " + discount + "%";
    }
}

public class EcommerceSorting {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 70000, 4.5, 10),
                new Product("Phone", 30000, 4.7, 15),
                new Product("Headphones", 2000, 4.2, 25),
                new Product("Monitor", 15000, 4.3, 20)
        );

        // Dynamic sorting strategy
        String campaign = "DISCOUNT"; // PRICE, RATING, DISCOUNT

        Comparator<Product> comparator;

        switch (campaign) {
            case "PRICE":
                comparator = (p1, p2) -> Double.compare(p1.price, p2.price);
                break;

            case "RATING":
                comparator = (p1, p2) -> Double.compare(p2.rating, p1.rating);
                break;

            case "DISCOUNT":
                comparator = (p1, p2) -> Double.compare(p2.discount, p1.discount);
                break;

            default:
                comparator = (p1, p2) -> 0;
        }

        // Apply sorting using Stream API
        List<Product> sortedProducts = products.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

        // Display result
        sortedProducts.forEach(System.out::println);
    }
}
