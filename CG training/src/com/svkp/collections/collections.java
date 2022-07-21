package com.svkp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collections {

	public static void main(String[] args) {
	//	int values[] = new int[4];
	//	Object values1[] = new Object[4];
    //    values1[0] = "pavani";  
    //    values1[1] = 9;
		List<Integer> values = new ArrayList<Integer>();
		values.add(7);
		values.add(4);
		values.add(5);
		values.add(21);
		Collections.sort(values);
		
		values.forEach(System.out::println);
	//	Iterator i = values.iterator();
		//while (i.hasNext())
		//{
			//System.out.println(i.next());
				
			
		//}
		//for(Object i : values) {
			//System.out.println(i);
		//}
	}

}
