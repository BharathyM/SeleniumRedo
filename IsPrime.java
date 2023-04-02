package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =19;
		int m = num/2;
		int count = 0;
		
		if((num==0)||(num==1))
		
			System.out.println(num+" is not Prime");
		
		else
		{
		for(int i=2;i<=m;i++)
		{
		if(num%i == 0)
			count = 1;
		System.out.println(num +" is not prime");
		break;
		
		}
	}
		 if(count == 0)
		System.out.println(num +" is prime");
	}
			
				

}
