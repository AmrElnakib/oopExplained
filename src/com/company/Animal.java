package com.company;

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