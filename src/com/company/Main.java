package com.company;

// Main class to demonstrate polymorphism and method overriding
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        // Polymorphism: the method sound() will be called based on the object's actual class
        myDog.sound(); // Outputs: Bark
        myCat.sound(); // Outputs: Meow

        // Calling concrete method from the abstract class
        myDog.sleep(); // Outputs: Sleeping...
        myCat.sleep(); // Outputs: Sleeping...

        // Demonstrating method overriding
        makeAnimalSound(myDog); // Outputs: Bark
        makeAnimalSound(myCat); // Outputs: Meow
    }

    // A method that takes an Animal reference
    static void makeAnimalSound(Animal animal) {
        animal.sound(); // Calls the overridden sound() method of the actual object
    }
}