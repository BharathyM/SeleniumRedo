package week2.day2.java;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "Changeme";
		
		char arr[]=test.toCharArray();
		
		for(int i=0;i<arr.length;i++)
			if(i%2==0)
				System.out.print(Character.toUpperCase(arr[i]));
			else
				System.out.print(Character.toLowerCase(arr[i]));

	}

}
