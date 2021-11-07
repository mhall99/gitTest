package java_assignment_Nov3;

/*
 * 9.	Write a program to read a string and a character, 
 * and reverse the string and convert it in a format 
 * such that each character is separated by 
 * the given character. Print the final string. 
 * 
 * Create a class UserMainCode with a static method 
 * reshape which accepts a string and a character. 
 * The return type (String) should return the final string. 
 * 
 * Create a Class Main which would be used 
 * to accept a string and a character, and call 
 * the static method present in UserMainCode. 
 * 
 * Input and Output Format: 
 * Input consists of a string and a character. 
 * Output consists of a string (the final string). 
 
Sample Input: Rabbit - 
Sample Output: t-i-b-b-a-R 

 */

public class Java_assign_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reshape("Rabbit", '-'));

	}

	static String reshape(String input, char a) {
		StringBuilder list = new StringBuilder();
		StringBuilder list1 = new StringBuilder();
		list.append(input);
		list.reverse();
		int k = 0;
		int j = 1;
		for (int i = 0; i < input.length(); i++) {
			if (i == input.length() - 1) {
				list1.append(list.charAt(i));
				return list1.toString();
			}
			list1.insert(k, list.charAt(i));
			list1.insert(j, a);
			j = j + 2;
			k = k + 2;
		}
		return list1.toString();
	}

}
