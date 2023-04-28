package CollectionsProgram;


import java.util.*;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] arr= {"HCL","Wipro","Aspire Systems","CTS"};
		
		List<String> list = Arrays.asList(arr);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=list.size()-1;i>=0;i--)
			System.out.println(list.get(i));
		



	}

}


/*	
 * Solution 2
 * ArrayList<String> al = new ArrayList<String>();

al.add("HCL");
al.add("Wipro");
al.add("Aspire Systems");
al.add("CTS");  
		
Collections.sort(al);
System.out.println(al);

for(int i=al.size()-1;i>=0;i--)
	System.out.println(al.get(i));

*/
