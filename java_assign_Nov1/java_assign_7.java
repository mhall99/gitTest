package com.mack.java_assign_Nov1;

/* 
 * Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz". 
Ex :	3 : fizz                                                                 
5 : buzz                                                                 
6 : fizz                                                                 
9 : fizz                                                                 
10.	: buzz 

 */
public class java_assign_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz(100);

	}

	private static void FizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {

			if ((i % 15 == 0)) {
				System.out.println("FizzBuzz");
			}

			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}

			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}

			else {
				System.out.println(i);
			}

		}
	}

}
