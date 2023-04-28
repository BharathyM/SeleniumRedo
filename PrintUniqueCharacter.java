package CollectionsProgram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		String name ="Bharathy";
		
		char[] arr = name.toCharArray();
		
		Set<Character> s = new HashSet<Character>();
		
		for(int i=0;i<arr.length;i++)
			if(s.contains(arr[i]))
				s.remove(arr[i]);
		
			else
				s.add(arr[i]);
		
		System.out.println(s);
	}

}
