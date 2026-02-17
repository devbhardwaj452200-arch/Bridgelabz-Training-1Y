// Circle class
class Circle {
    double radius;

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void display() {
        System.out.println("Radius          : " + radius);
        System.out.println("Area            : " + calculateArea());
        System.out.println("Circumference   : " + calculateCircumference());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating object of Circle class
        Circle c1 = new Circle();

        // Assigning value to radius
        c1.radius = 7;

        // Displaying area and circumference
        c1.display();
    }
}
