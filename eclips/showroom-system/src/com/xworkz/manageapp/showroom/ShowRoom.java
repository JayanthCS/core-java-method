package com.xworkz.manageapp.showroom;

import com.xworkz.manageapp.manager.Manager;

public class ShowRoom {

	Manager manager[] ;
	
	int i;
	
   	public ShowRoom(int size) {
		System.out.println("ShowRoom Object is created");
		  manager = new Manager[size];
	}
	
	public boolean saveManager(Manager manager) {
		System.out.println("saveManager method Started");
		boolean isAdded = false;
		if(manager.managerName != null && !(manager.managerName.isEmpty())) {
			this.manager[i++] = manager;
			
			isAdded = true;
		}
		
		System.out.println("saveManager method ended");
		return isAdded;
	}
	
	   public void getAllManager() {
		   
		   System.out.println("Manager info");
		   for(int i=0; i <this.manager.length; i++) {
			   System.out.println(manager[i].managerId +"   "+manager[i].managerName + "   "+manager[i].adress + "   "+manager[i].qualification + "   "+manager[i].contactNo +"  "+manager[i].gender);
		       
		   }
	   }	
	   
	   public Manager getManagerByManagerQualification(String qualification) {
		   System.out.println(" inside getManagerByManagerQualification method");
		   System.out.println("One paramter : String" + qualification);
		   for(int i  = 0 ; i < manager.length; i++) {
			   if(manager[i].qualification == qualification) {
				   System.out.println(manager[i].managerId +"   "+manager[i].managerName + "   "+manager[i].adress + "   "+manager[i].qualification + "   "+manager[i].contactNo +"  "+manager[i].gender); 
				   return manager[i];
			   }
		   }
		   return null;
	   }
	   
	   public boolean updateManagerContactNoById(int id , long newPhoneNumber) {
		   boolean phoneNumberUpdated = false ; 
		   for (int i = 0; i < manager.length; i++) {
			 if(manager[i].managerId == id) {
				 manager[i].contactNo=   newPhoneNumber ; 
			 }
			 else {
				 
			 }
		}
		   return phoneNumberUpdated ; 
	   }
	
}
