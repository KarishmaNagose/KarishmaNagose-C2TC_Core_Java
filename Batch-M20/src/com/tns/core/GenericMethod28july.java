package com.tns.core;
import java.util.ArrayList;
public class GenericMethod28july {

	public static void main(String[] args) {
		ArrayList l=new ArrayList(); //Growable in nature
		l.add("A");  //heterogenous
		l.add(1000); // support of in built methods
		l.add(4.5);  
		l.add(null);
		l.remove(2);

		l.add(2,"M");
		l.add("P");
		System.out.println(l);

	}

}
