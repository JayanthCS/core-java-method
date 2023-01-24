package com.xworkz.app;

import java.util.Scanner;

public class HospitalTester{

	 public static void main(String[] arag){
		 
		    System.out.println("Main method started");
		    
		    Scanner scanner =new Scanner(System.in);
		    System.out.println("Enter the size");
		    int size = scanner.nextInt();
			
			Hospital hospital = new Hospital(size);
			
			for(int i=0; i < size; i++) {
				
				System.out.println("Enter the patient Name");
				String patientName = scanner.next();
				System.out.println("Enter patient age");
				int patientAge = scanner.nextInt();
				System.out.println("Enter patient bloodgroup");
				String patientbloodGroup = scanner.next();
				System.out.println("Enter patient gender");
				String patientGender = scanner.next();
				System.out.println("Enter patient Id");
				int patientId = scanner.nextInt();
				
		    Patient patient = new Patient(patientName, patientAge, patientbloodGroup , patientGender ,patientId );
		   // Patient patient1 = new Patient("jay", 30, "O-" , "Male" , 2);

			
		
			hospital.admit(patient);
		
			}
			hospital.getAllPatient();
			
            System.out.println("GetThe patient by Id");
			   hospital.getPatientByPatientId(2);
			   
			   System.out.println("Updating The Patient Info");
			   hospital.updatePatientAgeByPatientId(81, 1);
			   
			   
			   System.out.println("Updating the patients info");
			   hospital.updatePatientNameByPatientGender("Darshan", "Male");
			   
			 hospital.getAllPatient();
			   
	        System.out.println("The main method is ended");
	        scanner.close();
		   }

	
}
