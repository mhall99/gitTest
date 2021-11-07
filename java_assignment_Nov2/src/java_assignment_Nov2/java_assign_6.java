package java_assignment_Nov2;

/*
 * 6. Your task is to create the class Addition and 
 *     the required methods so that the code 
 *     prints the sum of the numbers 
 *     passed to the function addition. 
 */

import java.util.*;

public class java_assign_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		// int[] arr = {1,2,1};
		obj.addNum();

	}

}

class Addition {
	public void addNum() {
		int sum = 0;
		// int numOfNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you would like to sum: ");
		int numOfNum = sc.nextInt();
		int[] a = new int[numOfNum];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < numOfNum; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
			if (i == numOfNum - 1) {
				for (int j = 0; j <= i - 1; j++) {
					System.out.print(a[j] + "+");
				}
				System.out.print(a[i] + "=" + sum);
				System.out.println();
				continue;
			}
			if (i == 0) {
				// System.out.print(a[i]+"="+sum);
				System.out.println();
				continue;
			}
			// for (int j = 0; j < ; j++) {
			// if (j==a.length-1) {
			// System.out.print(a[j]);
			// }
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(a[j] + "+");
			}
			// System.out.print(a[i-1] + "+");
			System.out.print(a[i]);
			System.out.print("=" + sum);
			System.out.println();
		}
	}
	// String s2 = "";
	// String s = Arrays.toString(input);
	// double sum = Arrays.stream(input).sum();
	// for (int i=1; i < input.length; i++) {
	// String s3 = s2.concat(s.charAt(i));
	// System.out.print(s.charAt(i));
	// sum = sum + input[i];
	// }
	// System.out.println(sum);

}
