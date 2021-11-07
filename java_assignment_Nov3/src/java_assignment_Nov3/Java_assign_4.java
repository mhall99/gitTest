package java_assignment_Nov3;

import java.util.*;

/*
 * 4.	write a Java program to search for an element
 * 		 of an integer array of 10 elements. 
 */

public class Java_assign_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		int target = 4;
		searchArr(arr,target);

	}
	
	static int searchArr(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i:arr) {
			list.add(i);
		}
		System.out.println(target+" exists at index " + list.indexOf(target) + " within the array.");
		return list.get(list.indexOf(target));
	}

}
