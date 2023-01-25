package com.xworkz.managerapp.showroom;

import java.util.Scanner;

import com.xworkz.managerapp.manager.Manager;

public class ShowRoomTester {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		Manager manager = new Manager();
		System.out.println("Enter the manager name");
		String name = scanner.next();
		manager.setName(name);
		System.out.println("Enter manager age");
		manager.setAge(scanner.nextInt());
		System.out.println("Enter manager qualification");
		manager.setQualification(scanner.next());
		System.out.println("Enter manager contactNo");
		manager.getContactNo(scanner.nextLong());
		System.out.println(manager.getName() + "   "+ manager.getAge() + "   "+ manager.getQualification() + "   "+ manager.getContactNo() );
	        
		scanner.close();
	}
	
	
}
