package com.xworkz.concepts;

public class Box {

	public static void store(int money) {
		System.out.println("money :"+money);
	}	
	public static void store(String bangle) {
		System.out.println("bangle is "+bangle);	
	}
	public static void store(String powder, String cream) {
		System.out.println("powder name is "+powder+ "   "+ "cream name is "+cream);
	}
	
	public static void store(char charger, String mobile) {
		System.out.println("charger type is "+charger + "   "+ "mobile name is " +mobile);
	}
	public static void store(int money , String pendrive,String card) {
		System.out.println(money + "   "+pendrive +"    "+card);
	}
	
}
