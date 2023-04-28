package week2.day2.java;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		
		String name = "abbaba";
		
		Map<Character , Integer> map =new HashMap<>();
		
		char[] ch = name.toCharArray();
		
		for(char c : ch)
			if(map.containsKey(c))
				map.put(c,map.get(c)+1);
			else				
				map.put(c, 1);
		
		System.out.println(map);
				
	}

}
