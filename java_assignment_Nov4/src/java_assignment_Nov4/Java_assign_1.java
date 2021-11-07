package java_assignment_Nov4;

/*
 * .Create an abstract class named Shape with the following
 * protected attributes / member variables. 
 	String name 
 	
 	Include a 1-argument constructor. 
 	Include getters and setters. 
 	
 	Include an abstract method named calculateArea() . This method returns a Float value. 
 	
 	Create a class named Circle . The class Circle is a derived class of Shape. Include the   
 	following private attributes / member variables. 
 	Integer radius 
 	
	 Include a 2-argument constructor. The order of the arguments is name, radius. 
	 Include getters and setters. 
	 Override the abstract method calculateArea() defined in the Shape class. 
	 This method returns the area of the circle. [Take the value of pi as 3.14] 
	 
	 Create a class named Square . 
	 The class Square is a derived class of Shape. Include the following private attributes / member variables. 
	 
	 Integer side 
	 Include a 2-argument constructor. The order of the arguments is name, side. 
	 Include getters and setters. 
	 
	 Override the abstract method calculateArea() defined in the Shape class. 
	 This method returns the area of the square.
	  
	 Create a class named Rectangle . The class Rectangle is a derived class of Shape. 
	 Include the following private attributes / member variables. 
	 Integer length 
	 Integer breadth 
	 
	 Include a 3-argument constructor. The order of the arguments is name, length, breadth 
	 Include getters and setters. 
	 
	 Override the abstract method calculateArea() defined in the Shape class. 
	 This method returns the area of the rectangle. 
	 
	 Create another class called Main. In the method, create instances of the above classes and test the above classes. 
	 
 
 
 
	All Float values are displayed correct to 2 decimal places. 
	All text in bold corresponds to input and the rest corresponds to output. 
	
	Sample Input and Output 1: 
	Circle 
	Square 
	Rectangle  
	
	Enter the shape name  
	Circle  
	
	Enter the radius  
	25  
	
	Area of Circle is 1962.50 

 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

abstract class Shape {
	String name;

	Shape(String n) {
		name = n;
	}

	abstract float calculateArea();

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
}

class Circle extends Shape {
	private int radius;

	protected int getRadius() {
		return radius;
	}

	protected void setRadius(int radius) {
		this.radius = radius;
	}

	Circle(String n, int r) {
		super(n);
		radius = r;
	}

	@Override
	float calculateArea() {
		double area = 2 * 3.14 * radius;
		Double Area = Double.valueOf(area);
		float f = Area.floatValue();
		System.out.print("Area of " + name + " is ");
		System.out.printf("%.2f", f);
		System.out.println();
		return f;
	}
}

class Square extends Shape {
	private int side;

	protected int getSide() {
		return side;
	}

	protected void setSide(int side) {
		this.side = side;
	}

	Square(String n, int s) {
		super(n);
		side = s;
	}

	@Override
	float calculateArea() {
		double area = 2 * side;
		Double Area = Double.valueOf(area);
		float f = Area.floatValue();
		System.out.print("Area of " + name + " is ");
		System.out.printf("%.2f", f);
		System.out.println();
		return f;
	}

}

class Rectangle extends Shape {
	private int height;

	protected int getHeight() {
		return height;
	}

	protected void setHeight(int height) {
		this.height = height;
	}

	protected int getWidth() {
		return width;
	}

	protected void setWidth(int width) {
		this.width = width;
	}

	private int width;

	Rectangle(String n, int h, int w) {
		super(n);
		height = h;
		width = w;
	}

	@Override
	float calculateArea() {
		double area = height * width;
		Double Area = Double.valueOf(area);
		float f = Area.floatValue();
		System.out.print("Area of " + name + " is ");
		System.out.printf("%.2f", f);
		System.out.println();
		return f;
	}

}

public class Java_assign_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Circle \nSquare \nRectangle");
		System.out.println("Please enter your shape: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		switch (s) {
		case "Circle": {
			System.out.println("Please enter radius value: ");
			int rad = sc.nextInt();
			Circle c = new Circle(s, rad);
			c.calculateArea();
		}
			break;
		case "Rectangle": {
			System.out.println("Please enter height value: ");
			int ht = sc.nextInt();
			System.out.println("Please enter width value: ");
			int wd = sc.nextInt();
			Rectangle rect = new Rectangle(s, ht, wd);
			rect.calculateArea();
		}
			break;
		case "Square": {
			System.out.println("Please enter side value: ");
			int side = sc.nextInt();
			Square squ = new Square(s, side);
			squ.calculateArea();
		}
			break;
		default: {
			System.out.println("Invalid input.");
		}
			return;
		}

		// Circle c = new Circle("Circle",2);
		// float c_area = c.calculateArea();
		// System.out.println(c_area);

		// Square s = new Square("Square",2);
		// float s_area = s.calculateArea();
		// System.out.println(s_area);

		// Rectangle r = new Rectangle("Rect",2,4);
		// float r_area = r.calculateArea();
		// System.out.println(r_area);

	}

}
