
// A simple Java program to demonstrate OOP concepts
class Person {
    // Fields/Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Person person1 = new Person("Rahul Prasad", 20);
        Person person2 = new Person("Aryan Sha", 13);

        // Display initial details
        person1.displayDetails();
        person2.displayDetails();

        // Modify and display updated details
        person1.setAge(21);
        System.out.println("\nUpdated Details:");
        person1.displayDetails();
    }
}
