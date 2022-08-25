package com.tns.core;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// creating
		HashSet<Integer> set =  new HashSet<>();
		
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		
		//Search - Contains
		if(set.contains(1)) {
			
			System.out.println("Set contains 1");
		}
		if(!set.contains(6)) {
			System.out.println("does not contain");
		}
		
		//size
		System.out.println("Size of set is "+set.size());
		
		//print all elements
		System.out.println(set);
		
		//Delete
	    set.remove(1);
		System.out.println("doesn't conatin 1 - we Deleted");
				
		//print all elements
				System.out.println(set);
				
		//Iterator
		Iterator it=set.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
