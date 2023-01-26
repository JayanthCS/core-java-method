package com.xworkz;

import com.xworkz.concepts.Box;

public class BoxTester {

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		Box.store(999);
		Box.store("Gold");
		Box.store("ponds", "fair and handsome");
		Box.store('C',"Mi");
		Box.store(899, "samsung", "5Gb");
		
		System.out.println("Outside main method");
	}
}
