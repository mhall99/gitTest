package java_assignment_Nov2;

/*
 * 5. Create class named as ‘A’ and create a sub class ‘B’. 
 *    Which is extends from class ‘A’. 
 *    And use these classes in ‘inherit’ class. 
 */

class A {
	public void identity() {
		System.out.println("I am class A.");
	}
	public void parentThing() {
		System.out.println("I am a method from parent class A.");
	}
}
class B extends A {
	public void identity() {
		System.out.println("I am class B, extended from A.");
	}
	
	//System.out.println(about);
}

public class java_assign_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B child = new B();
		child.identity();
		child.parentThing();

	}

}