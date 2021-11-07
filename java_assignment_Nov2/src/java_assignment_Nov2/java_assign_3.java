package java_assignment_Nov2;

/*
 * 3. Write a Java method to count all vowels in a string.  
   Input the string: 
   Hcl Technologies  
   Expected Output: 
   Number of  Vowels in the string: 5 

 */

public class java_assign_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numOfVowels("Hcl Technologies");

	}
	
	private static int numOfVowels(String input) {
		int num = 0;
		input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' 
					|| input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				num = num + 1;
			}
		}
		System.out.println(num);
		return num;
	}

}
