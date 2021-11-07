package java_assignment_Nov3;

/*
 * 5.	Accept a string, and two indices(integers), 
 * and print the substring consisting of 
 * all characters inclusive range from ..to .
 *   
	Sample Input 
	Helloworld 
	3 7 

	Sample Output 
	Lowo 

 */

public class Java_assign_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Helloworld";
		int a = 3;
		int b = 7;
		System.out.println(subString(input, a, b));

	}

	static String subString(String input, int from, int to) {
		return input.substring(from, to);
	}

}
