package com.mack.java_assign_Nov1;

/*
 * 3.  Write a Java program that takes three numbers as input 
 *     to calculate and print the average of the numbers. 
 */

public class java_assign_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		average(10.0, 20.0, 30.0);

	}
	
	public static double average(double x, double y, double z)
    {
        double avg = (x + y + z) / 3;
		System.out.println(avg);
		return avg;
    }

}
