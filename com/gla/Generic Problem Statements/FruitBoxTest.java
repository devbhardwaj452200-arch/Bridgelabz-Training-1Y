// Base class
class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Fruit: " + name);
    }
}

// Subclass Apple
class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }
}

// Subclass Mango
class Mango extends Fruit {
    public Mango(String name) {
        super(name);
    }
}

// Generic FruitBox with bounded type
class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> fruits = new java.util.ArrayList<>();

    // Add fruit
    public void add(T fruit) {
        fruits.add(fruit);
    }

    // Display fruits
    public void display() {
        for (T fruit : fruits) {
            fruit.display();
        }
    }
}

// Test class
public class FruitBoxTest {
    public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();

        box.add(new Apple("Red Apple"));
        box.add(new Mango("Alphonso Mango"));

        box.display();

        // ❌ This will NOT compile
        // FruitBox<Car> carBox = new FruitBox<>();
        // carBox.add(new Car());
    }
}
