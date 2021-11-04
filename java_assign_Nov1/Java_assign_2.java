package com.mack.java_assign_Nov1;

/*
 * 2.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.  
 
Test Data: 
Input first number: 20 
Input second number: 4 

 */

public class Java_assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations(20.0,4);

	}
	
	private static double operations(double a, double b) {
		double sum = a + b;
		double multi = a*b;
		double subtract = a-b;
		double div = a/b;
		double remainder = a%b;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + multi);
		System.out.println(a + " - " + b + " = " + subtract);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " % " + b + " = " + remainder);
		return sum; 
	}

}
