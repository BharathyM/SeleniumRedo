package week1.day2;

public class Arrayrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,5,7,8,9,0,4,5,2,3,11,21,32,5,23,67};
		int count=0;
		for(int i=0;i<a.length;i++)
			if(a[i]==5)
				count=count+1;
		
		System.out.println("Number 5 repeated "+count+ " times!!");
	}

}
