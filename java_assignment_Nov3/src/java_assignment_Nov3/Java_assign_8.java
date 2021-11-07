package java_assignment_Nov3;

/*
 * 8.	Write a program to read a string and return 
 * a modified string based on the following rules. 
Return the String without the first 2 characters 
except when 
	a.	Keep the first char if it is 'k' 
	b.	Keep the second char if it is 'b'. 
	
Create a class UserMainCode with a static method 
getString which accepts a string and 
the return type (string) should be 
the modified string based on the above rules. 
Consider all letters in the input to be small case. 
 
Input and Output Format: 
Input consists of a string with maximum size
of 100 characters. 
Output consists of a string. 
 
Sample Input 1: 
        hello 
Sample Output 1: 
        llo 
Sample Input 2: 
       kava 
Sample Output 2: 
        kva 

 */

public class Java_assign_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getString("kava"));

	}

	static String getString(String input) {
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		// char[] temp = input.toCharArray();
		if (input1.charAt(0) == 'k' && input1.charAt(1) == 'b') {
			return input;
		} else if (input1.charAt(1) == 'b') {
			return input.substring(1);
		} else if (input1.charAt(0) == 'k') {
			input1.deleteCharAt(1);
			return input1.toString();
		} else {
			return input.substring(2);
		}

	}

}
