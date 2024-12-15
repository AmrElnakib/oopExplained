// Abstract class Animal
abstract class Animal {
	// Abstract method (does not have a body)
	abstract void sound();

	// Concrete method
	void sleep() {
		System.out.println("Sleeping...");
	}
}

// Dog class inherits from Animal
class Dog extends Animal {
	// Overriding the abstract method
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

// Cat class inherits from Animal
class Cat extends Animal {
	// Overriding the abstract method
	@Override
	void sound() {
		System.out.println("Meow");
	}
}

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