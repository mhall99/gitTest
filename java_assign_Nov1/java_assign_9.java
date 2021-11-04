package com.mack.java_assign_Nov1;

import java.util.LinkedList;

/*
 * 9. Write a program to read a number, calculate the sum of squares 
 *    of even digits (values) present in the given number.  
 *    Create a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer. 
 *    The return type (integer) should be the sum of squares of the even digits. 
 *    Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode. 
Sample Input 1: 
     56895 
Sample Output 1: 
      100 

 */

public class java_assign_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 56895;
		sumOfSquaresOfEvenDigits(input);

	}

	private static int sumOfSquaresOfEvenDigits(int n) {
		// Stack<Character> st = new Stack<Character>()
		LinkedList<Integer> st = new LinkedList<Integer>();
		int[] num_array;
		int sum = 0;
		int pop;
		while (n > 0) {
			st.push(n % 10);
			n = n / 10;
		}
		while (!st.isEmpty()) {
			pop = st.pop();
			System.out.print(pop);
			if (pop % 2 == 0) {
				sum = sum + pop*pop;
			}
		}
		System.out.println("n/Sum of squares of even digits is: " + sum);
		return(sum);

	}

}
