package com.tns.core;

import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ArrayList l = new ArrayList();//Growable in nature
            l.add("A");//hetrogenous
            l.add(10);//support of built in methods
            l.add(20);
            l.add(null);
            l.remove(2);
            l.add(2,"M");
            l.add("N");
            System.out.println(l);
	}

}
