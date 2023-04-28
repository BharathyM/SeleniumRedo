package CollectionsProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {


		int[] num = {1,2,3,4,5,6,7,8,10};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int i =0 ;i< num.length;i++)
			if(num[i]==i+1)
		set.add(num[i]);
			else
				System.out.println("The missing number is :"+(i+1));
		
		
		
		

	}

}
