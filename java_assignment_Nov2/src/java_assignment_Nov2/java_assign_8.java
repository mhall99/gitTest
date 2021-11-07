package java_assignment_Nov2;

/*
 * Consider the below code and you must 
 * add a ‘bark method to the Dog class, then modify 
 * the main method accordingly so that 
 * the code prints the following lines: 
   I am walking 
   I am eating 
   I am barking 

 */

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("I am eating");
	}
	
	void bark() {
		System.out.println("I am barking");
	}
}

public class java_assign_8 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
	}
}
