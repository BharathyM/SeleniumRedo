package week2.day2.java;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {


		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer , Integer> map = new TreeMap<>();
		
	for(int eachEntry : input)
		if(map.containsKey(eachEntry))
		{
			map.put(eachEntry, (map.get(eachEntry)+1));
		}
		else
			map.put(eachEntry, 1);
	
	System.out.println(map);

	}

}
