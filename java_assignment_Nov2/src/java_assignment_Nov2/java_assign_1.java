package java_assignment_Nov2;
import java.lang.Math;

/*
 * 1.Write a Java method 
 *   to find the smallest number among three numbers.
 */

public class java_assign_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallestNum(8,3,4));

	}
	
	private static int smallestNum(int a, int b, int c) {
		//int smallest = Math.min(Math.min(a, b), c);
		//System.out.println(smallest);
		return Math.min(Math.min(a, b), c);
	}

}
