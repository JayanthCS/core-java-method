package com.xworkz.manageapp.showroom;

import java.util.Scanner;

import com.xworkz.manageapp.manager.Manager;
import com.xworkz.manageapp.showroom.ShowRoom;

public class ShowRoomTester {

	public static void main(String[] args) {

		System.out.println("Main method started");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		 int size =   scanner.nextInt();
		ShowRoom room = new ShowRoom(size);
		
		for (int i = 0; i < size ;  i++) {
			
		
		System.out.println("Enter the Manager Id");
		int managerId = scanner.nextInt();
		System.out.println("Enter the Manager Contact No");
		long contactNo = scanner.nextLong();
		System.out.println("Enter the Manager Name");
		String managerName = scanner.next();
		System.out.println("Enter the Manager Address");
		String address = scanner.next();
		System.out.println("Enter the Manager Qualification");
		String managerQualification = scanner.next();

		System.out.println("Enter the Manager Gander");
		String gender = scanner.next();
		

		Manager manager = new Manager(managerId, managerName, address, managerQualification, contactNo, gender);
		
		room.saveManager(manager);
		
		}

		room.getAllManager();

		System.out.println("Main method ended");
             scanner.close();
	}

}
