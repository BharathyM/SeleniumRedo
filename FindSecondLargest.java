package CollectionsProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> st = new TreeSet<Integer>();
		
		for(int i=0;i<data.length;i++)
			st.add(data[i]);
		List<Integer> list = new ArrayList<>();
		list.addAll(st);
		
		System.out.println(list);
		
		System.out.println("Second last element is :" +list.get(list.size() -2));

	}

}
