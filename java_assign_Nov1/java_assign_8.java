package com.mack.java_assign_Nov1;

import java.util.Stack;

/*
 * Write a program to read a number and calculate the sum of odd digits (values) present in the given number. 
Create a class with a static method checkSum which accepts a positive integer. 
The return type should be 1 if the sum is odd. In case the sum is even return -1 as output. 
Create a class Main which would get the input as a positive integer and 
call the static method checkSum present in the UserMainCode. 

Sample Input 1: 
56895 
Sample Output 1: 
Sum of odd digits is odd. 

Sample Input 2: 
84228 
Sample Output 2: 
Sum of odd digits is even. 

 */

import java.util.*;

public class java_assign_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSum(84228);

	}

	private static void checkSum(int n) {
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
			if (pop % 2 != 0) {
				sum = sum + pop;
			}
		}
		if (sum % 2 == 0) {
			System.out.println("\nSum of odd digits is even.");
		} else {
			System.out.println("\nSum of odd digits is odd.");
		}
		
	}

}
