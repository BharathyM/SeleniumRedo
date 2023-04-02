package week1.day1;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int FirstNum=0;
		int SecNum=1;
		int sum=0;
		
		System.out.print(FirstNum+" "+SecNum+" ");
		for(int i=0;i<11;i++)
		{
			
			sum=FirstNum+SecNum;
		FirstNum=SecNum;
		SecNum=sum;
			
		System.out.print(sum + " ");
		}	
	}

}
