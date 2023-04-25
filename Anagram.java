package week2.day2.java;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "spotees"; 
		
		if(text1.length()==text2.length())
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
				System.out.println("Given string is Anagram");
		}
			else
				System.out.println("Given String is not Anagram");
		
		}
			

	}


