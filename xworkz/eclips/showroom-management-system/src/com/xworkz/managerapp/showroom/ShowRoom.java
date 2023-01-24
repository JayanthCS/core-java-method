package com.xworkz.managerapp.showroom;

import com.xworkz.managerapp.manager.Manager;

public class ShowRoom {
  
	Manager manager[];
	int index;
	
	public ShowRoom(int size) {
		
		System.out.println("The object showroom is created");
		manager= new Manager[size];
	}
	
	public String saveManager(Manager manager) {
		System.out.println("Inside the save manager method");
		boolean isSaved = false;
		if(manager.getName()!= null) {
			this.manager[index++] = manager;
			isSaved = true;
		}
		return null;
	}
}
