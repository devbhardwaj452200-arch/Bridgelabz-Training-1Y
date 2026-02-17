// Person class
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    // Method to display person details
    void display() {
        System.out.println("Person Details:");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating original person object
        Person person1 = new Person("Alice", 25);
        person1.display();

        // Creating a copy using copy constructor
        Person person2 = new Person(person1);
        person2.display();
    }
}
