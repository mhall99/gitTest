package com.mack.java_assign_Nov1;

/*
 * 5. Write a java program, which will take a number variable 
 *    and check whether the number is prime or not. 
 */

public class java_assign_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(11));

	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i = i + 6) {
			if (n % 2 == 0 || n % 3 == 0) {
				return false;
			}
		}
		return true;
		// for (int i = 2; i < n; i++) {
		// if (n % i == 0) {
		// return false;
		// }
		// return true;
		// }
	}

}
