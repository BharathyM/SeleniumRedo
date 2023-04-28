/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

**************INCOMPLETE, NEED HELP***********************************************

 * 
 * 
 */



package week2.day2.java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaChallenge4 {
	
	public static void main(String[] args) {
		
	int[] nums = {4,1,2,1,2};

	
	Set<Integer> s=new LinkedHashSet<Integer>();
	for(int i:s)
	{
		if(s.contains(nums[i]))
			s.remove(nums[i]);
			else
				s.add(nums[i]);
	}
	
	System.out.println(s);
}
}
