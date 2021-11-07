package java_assignment_Nov2;

/*
 * 2. Write a Java method to display the middle character 
 *    of a string.  
 a) If the length of the string is odd 
    there will be two middle characters. 
 b) If the length of the string is even 
    there will be one middle character. 
    
  Input a string: 367  
  Expected Output:                                                                     
  The middle character in the string: 6 

 */
import java.lang.Math;

public class java_assign_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] middle_arr = middleCharacter("Rob");
		char[] middle_arr = middleCharacter("367");
		System.out.println(new String(middle_arr));

	}
	
	private static char[] middleCharacter(String input) {
		//char middle;
		if (input.length() % 2 == 0) {
			//even number of chars in string 
			char[] evenStr_middle_arr = {input.charAt(Math.round(input.length()/2)-1)
					,input.charAt(Math.round(input.length()/2))};
			return evenStr_middle_arr;
		}
		else {
			char[] oddStr_middle_arr = {input.charAt(input.length()/2)};
			return oddStr_middle_arr;
		}
	}

}
