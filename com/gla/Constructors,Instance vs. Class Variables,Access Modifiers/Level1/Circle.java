// Circle class
class Circle {
    double radius;

    // Default constructor
    Circle() {
        // Constructor chaining: call parameterized constructor with default value
        this(1.0);  // Default radius = 1.0
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    void display() {
        System.out.println("Circle Details:");
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + area());
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Circle c1 = new Circle();
        c1.display();

        // Using parameterized constructor
        Circle c2 = new Circle(5.0);
        c2.display();
    }
}
