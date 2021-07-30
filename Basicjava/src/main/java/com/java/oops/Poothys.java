package com.java.oops;

public class Poothys extends Dress{
	

	
	public void dresscolour()
	{
		System.out.println("Blue");
	}
	
	public void dresstype()
	{
		System.out.println("pant and shirt");
	}
		

	public static void main(String[] args) {
		
		Dress ref=new Poothys();
		ref.dresscolour();
		ref.dressdesign();
		ref.dresstype();
	}

}
