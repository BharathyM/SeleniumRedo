package CollectionsProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String name ="PayPal India";
		
		char[] ch = name.toCharArray();
		
		Set<Character> charSet  = new TreeSet<Character>();
		HashSet<Character> dupCharSet  = new LinkedHashSet<Character>();
		
		
		for(int i=0;i<ch.length;i++)
		{
		charSet.add(ch[i]);
		System.out.println(ch[i]);
		}
		
		System.out.println(charSet);
		
	

	}

}
//////Need help