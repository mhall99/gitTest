package com.mack.java_assign_Nov1;

/*
 * 4. Write a Java program to swap two variables
 */

public class java_assign_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 3;
		System.out.println("Before method call \nx: " + x + "\n" + "y: " + y);
		int ans[] = swap(x,y);
		System.out.println("After method call \nx: " + ans[0] + "\n" + "y: " + ans[1]);

	}
	
	private static int[] swap(int x, int y) {
		int[] ans = new int[2];
		int temp = x;
		ans[0] = y;
		ans[1] = temp;
		
		return ans;
	}

}
