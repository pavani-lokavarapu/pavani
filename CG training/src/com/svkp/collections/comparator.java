package com.svkp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class comparator {

	public static void main(String[] args){
		List<Integer> values = new ArrayList<Integer>();
		values.add(504);
		values.add(703);
		values.add(200);
		values.add(601);
		Comparator<Integer> com = new imple();
		Collections.sort(values,com);
		//Collections.sort(values);
	//Collections.reverse(values);
	//	Vector<Integer> v = new Vector<Integer>();
		//v.add(4);
		//v.add(10);
	//	v.add(30);
		//v.add(17);
		//v.remove(3);
		//System.out.println(v.capacity());
	for(int i : values)
	{
			System.out.println(i);
	
	}

	}
}
