package week2.day2.java;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		
		String[] arr = test.split(" ");
		String text1 = "";
	
		for(int i =0;i<arr.length;i++)
		{
			if(i%2==1)
				text1=text1 + new StringBuilder(arr[i]).reverse().toString() + " ";

			else
			text1 =text1 +arr[i] + " ";	
		}
		
		System.out.println(text1);
	}

}
