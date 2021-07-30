package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		int[] i= {1,2,3,4,5,6,7,8};
		//int size=i.length[];
		System.out.println("The size of the array"+i.length);
		
		
		
		
		List<String> arraylist=new ArrayList<String>();
		arraylist.add("Benz");
		arraylist.add("Maruthi");
		arraylist.add("BMW");
		arraylist.add("chevorlet");
		arraylist.add("null");
		
		System.out.println(arraylist);
		
		int sizes=arraylist.size();
		System.out.println(sizes);
		
		arraylist.lastIndexOf(null);
		
		arraylist.indexOf("BMW");
		
		//System.out.println(storage);
		
	String index=	arraylist.get(1);
	    System.out.println(index);
	    
	    arraylist.remove(4);
	    System.out.println(arraylist);
	    
	    List<String> anotherlist=new ArrayList<String>();
	    anotherlist.addAll(arraylist);
	    System.out.println(anotherlist);
	    anotherlist.clear();
	    System.out.println(anotherlist);
	    
		
		

	}

}
