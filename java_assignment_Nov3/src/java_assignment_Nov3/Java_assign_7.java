package java_assignment_Nov3;

/*
 * 7.	Write a program to find the given string is pangram or not. 
	(Hint: Pangrams are words or sentences containing every letter of the alphabet at least once) 

	Sample Input 
	The quick brown fox jumps over the lazy dog sp.                                                 
	Sample Output: 
	Pangram 

 */
import java.util.*;

public class Java_assign_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str));

	}

	static String isPanagram(String input) {
		boolean[] mark = new boolean[26];
		int index = 0;
		String str = input.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			// subtract 'a'
			// to find index.
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';

			else
				continue;
			mark[index] = true;
		}

		// Return false if any character is unmarked
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return "Not a pangram";

		// If all characters were present
		return "Pangram";
	}

}
