 package CollectionsProgram;

import java.util.Arrays;

import java.util.LinkedHashSet;

import java.util.Set;


public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] arr = text.split(" ");
		System.out.println(Arrays.toString(arr));
		
		
		Set<String> set = new LinkedHashSet<String>();
		for(String s : arr)
		set.add(s);
		
		System.out.println(set);
		
	}

}
