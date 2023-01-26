package com.xworkz;

import com.xworkz.concepts.Person;

public class PersonTester {

	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		Person.buy("Samsung", 40000);
		Person.buy("Dose", 60.00F);
		Person.buy("WildCraft", "Sonata");
		Person.buy("Shirt","Casual","black");
		
		
		
		System.out.println("Outside main method");
	}
}
