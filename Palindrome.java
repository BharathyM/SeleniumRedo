package week2.day2.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value ="madam";
		String rev="";
		
		for(int i=value.length()-1;i>=0;--i)
			rev=rev+value.charAt(i);
		
		if(value.equalsIgnoreCase(rev))
			System.out.println("Given String "+rev +" is a Palindrome");
		
		else
			System.out.println("Given String "+rev+" is not a Palindrome");
	}

}
