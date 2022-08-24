package com.tns.core;
import java.util.*;


public class Hashmap {

	public static void main(String[] args) {
		// creation
		HashMap<String,Integer> map =new HashMap<>();
		
		//Insertion
		map.put("India", 120);
		map.put("US", 30);
		map.put("China",150);
		System.out.println(map);
		
		//Update
		map.put("India", 180);
		System.out.println(map);
		
		//Search
		if(map.containsKey("China")) {
			System.out.println("China is presnt in the map");
		}else {
			System.out.println("China is not present in the map");
		}
		//key exist or not
		
		System.out.println(map.get("China"));//Key Exist
		System.out.println(map.get("Indonesia"));//Key not Exist
		
		
		//Iterator Method1
		int arr[]= {10,12,14};
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println(" ");
		
		for(int val:arr) {
			System.out.println(val+" ");
		}
		System.out.println(" ");
		
		//Entry
		//for(int val:arr
		for(Map.Entry<String , Integer> e :map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//Methhhod2
		Set<String>keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		//Remove
		map.remove("China");
		System.out.println(map);

		
	}

}
