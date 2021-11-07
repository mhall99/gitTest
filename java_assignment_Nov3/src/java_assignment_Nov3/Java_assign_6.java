package java_assignment_Nov3;

import java.util.Objects;

/*
 * 6.	Given a string , print ‘Yes’ if it is a palindrome,
 * 		 print ‘No’ otherwise.  
	
	Sample Input 
	madam
	Sample Output 
	Yes 

 */

public class Java_assign_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("Bobby"));

	}
	
	static String isPalindrome(String input) {
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		//System.out.println(input);
		//System.out.println(input1);
		if (input.equalsIgnoreCase(input1.toString())) {
			return "Yes";
		}
		else {
			return "No";
		}
	}

}
