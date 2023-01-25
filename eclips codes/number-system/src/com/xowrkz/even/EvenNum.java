package com.xowrkz.even;

public class EvenNum {

	
	  public static void main(String[] a) {
		  
		  int evenCount=0, oddCount=0;
		  for(int i=0; i < 100; i++) {
			  if(i%2 ==0) {
				  evenCount+=1; // evenCount= evenCount+1;
			  }
			  else {
				  oddCount+=1;
			  }
		  }
		  System.out.println("Even count: "+evenCount);
		  System.out.println("Odd count : "+ oddCount);
	  }
}
