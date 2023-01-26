package com.xworkz.concepts;

public class Person {

	public static void buy(String mobile, int money) {
		System.out.println(mobile +"   "+money);
	}
	
	public static void buy(String food, float quantity ) {
		System.out.println(food +"    "+quantity);
	}
	
	public static void buy(String dress, String shoes , String belt) {
		System.out.println(dress +"   "+shoes +"    "+ belt);
	}
	
	public static void buy(String bag, String watch) {
		System.out.println(bag +"    "+watch);
	}
	
}
