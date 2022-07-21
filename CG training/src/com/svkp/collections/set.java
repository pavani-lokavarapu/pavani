package com.svkp.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		//System.out.println(values.add(3));
		//System.out.println(values.add(9));
		//System.out.println(values.add(12));
		//System.out.println(values.add(37));
		//values.add(3);
		//values.add(5);
		//values.add(45);
		//values.add(30);
		Map<String,String> map = new HashMap<>();
		map.put("pavani","lokavarapu");
		map.put("lokesh", "kandipoyina");
		map.put("nagababu","gade ");
		Set <String> keys = map.keySet ();
		for(String key : keys)
		{
		System.out.println(key+ " " + map.get(key));
	}

}
}
