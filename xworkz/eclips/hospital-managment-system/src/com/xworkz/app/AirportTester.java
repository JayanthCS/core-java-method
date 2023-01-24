package com.xworkz.app;

import java.util.Scanner;

public class AirportTester {

	public static void main(String[] arag) {
		
		System.out.println("Main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();
     		Airport airport =new Airport(size);
     		
     		
     		for(int i=0; i < size; i++) {
     			
     			System.out.println("Enter terminal Id");
     			int terminalId = scanner.nextInt();
     			System.out.println("Enter teminal name");
     			String terminalName = scanner.next();
     			System.out.println("Enter how many gates in terminal");
     			int gates    = scanner.nextInt();
		
		Terminal terminal = new Terminal(terminalId, terminalName, gates);
		//Terminal terminal1 = new Terminal(2, "Indian gate" , 7);
		//Terminal terminal2= new Terminal(3, "Jay Airport", 4);
	    //Terminal terminal3= new Terminal(4, "Yrdo Airport", 6 );
	    
	    airport.create(terminal);
	   // airport.create(terminal1);
	    //airport.create(terminal2);
	  //  airport.create(terminal3);
     		}
	    airport.getTerminal();
     		
	    System.out.println("Main method ended");
	    scanner.close();
	}
	
}
