package com.xworkz.app;

public class Hospital {
	
	
	  //has a relationship   (one to many)
    Patient patient[];
	  int index;
	
	public Hospital(int size){
	System.out.println("Hospital Object is created");
	patient = new Patient[size];
	
	}
      
	  //Patient patient[] = new Patient[size];
	  //String str = {"dev" , "jay", "abhi" ,"SUDEEP"};+
	  //Datatypes variable[] = new Datatypes[size];
	  // String str[] = new String[4];
	  // Create operation
	  public boolean admit(Patient patient){
	    System.out.println("Admit process started");
		boolean isAdmitted = false;
		
	  // validation
	    if(patient.patientName != null){
		   this.patient[index++]= patient;
		    isAdmitted = true;
		}
		
		System.out.println("Admit process ended");
		
		return isAdmitted;
	  }
	  
	  // Read operation
     public void getAllPatient(){
	   	 
		System.out.println("Patient Details");
        for(int i = 0; i<this.patient.length; i++){
		System.out.println(patient[i].patientId+ "  "+ patient[i].patientName+ "   "+ patient[i].bloodGroup+ "   "+ patient[i].gender+ "   "+patient[i].age);	
		}		
	 }

      public Patient getPatientByPatientId(int patientId) {
    	  
    	 System.out.println("Inside getpatientByPatientId method");
    	 for(int in=0; in< patient.length; in++) {
    		 if(patient[in].patientId == patientId) {
    			 System.out.println("Patient Id is matching... proceed the data  ");
    			 System.out.println(patient[in].patientId+ "  "+ patient[in].patientName+ "   "+ patient[in].bloodGroup+ "   "+ patient[in].gender+ "   "+patient[in].age);	
    			 return patient[in];
    		 }
    	 }	 
    		 System.out.println("End of  getpatientByPatientId method");
    		 return null;
    	 
      }
      
      public boolean updatePatientAgeByPatientId(int newAge , int patientId) {
    	 boolean isAgeUpdated = false;
    	 System.out.println("updatePatientAgeByPatientId started");
    	 for(int i=0; i < patient.length; i++) {
    		 if(patient[i].patientId == patientId) {
    		 System.out.println("the current Age is "+ patient[i].age);
    		 patient[i].age = newAge;
    		 System.out.println("The Updated Age is "+ patient[i].age);
    		 }
    	 }
    	 return isAgeUpdated;
    		 
    	  
      }
      
      public boolean updatePatientNameByPatientGender(String newName , String gender) {
    	  boolean isNameUpdated = false;
    	  System.out.println("updatePatientNameByPatientGender is Started");
    	  for(int i=0; i < patient.length; i++) {
    		  if(patient[i].gender == gender) {
    			System.out.println("The current name of patient is "+ patient[i].patientName);
    			patient[i].patientName = newName;
    			System.out.println("The updated name is " + patient[i].patientName);
    		  }
    	  }
    	  return isNameUpdated;
      }
      

	
}
