package com.xowrkz.even;

public class Digits {

	
	  public static void main(String[] a) {
		  
		int num = 1234;
		int count = 0;
		while(num>0) {
			num=num/10;
			
			
			System.out.println(num);
			count++;
		}
		System.out.println("The count of the number is : "+count);
	  }
}
