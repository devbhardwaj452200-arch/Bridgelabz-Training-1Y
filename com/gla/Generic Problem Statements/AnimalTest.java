import java.util.*;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class
class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Utility class
class AnimalPrinter {

    // Method using wildcard
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }
}

// Test class
public class AnimalTest {
    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        AnimalPrinter.printAnimals(dogs);
        AnimalPrinter.printAnimals(cats);
    }
}
