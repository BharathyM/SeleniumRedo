package week2.day2.java;

import java.util.Arrays;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class JavaChallenge3 {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panamas";
		
		String pros = s.replaceAll("[\\s,:,]","" ); 
		
		 StringBuilder rev = new StringBuilder(pros);
		 StringBuilder cmp = rev.reverse();
		
			
		if(cmp.toString().equalsIgnoreCase(pros))
			System.out.println("True");
		else
			System.out.println("False");
		
		

	}

}
