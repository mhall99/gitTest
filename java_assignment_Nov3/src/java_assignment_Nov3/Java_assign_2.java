package java_assignment_Nov3;

/*
 * 2.	Write a Java program to replace all the 'd' occurrence 
 *      characters with ‘h’ characters in each string
 */

public class Java_assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dToH("Dorothy dances."));

	}
	
	static String dToH(String input) {
		input = input.toLowerCase();
		char[] temp = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if(temp[i]=='d') {
				temp[i] = 'h';
			}
		}
		return String.valueOf(temp);
	}

}
