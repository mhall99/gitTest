package com.mack.java_assign_Nov1;

/*
 * Write a Program which finds the longest word from a sentence. Your program should read a sentence as input 
 * from user and return the longest word. In case there are two words of maximum length 
 * return the word which comes first in the sentence. 
 * Include a class UserMainCode with a static method getLargestWord which accepts a string 
 * The return type is the longest word of type string. 
 * Create a Class Main which would be used to accept two Input strings 
 * and call the static method present in UserMainCode. 
 
Sample Input 1: 
Welcome to the world of Programming 
Sample Output 1: 
Programming
 
Sample Input 2: 
ABC DEF 
Sample Output 2: 
ABC 
 
 */
public class java_assign_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getLargestWord("ABC DEF");
		getLargestWord("Welcome to the world of Programming");

	}

	private static void getLargestWord(String input) {
		String arr[] = input.split(" ");
		String longest_word = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > longest_word.length()) {
				longest_word = arr[i];
			} else if (arr[i].length() == longest_word.length()) {
				continue;
			}
		}
		System.out.println(longest_word);
	}

}
