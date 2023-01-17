class ApartmentTester{


    public static void main(String[] a){
	
	     Apartment.name = "Shobha";
		 Apartment.owner = "Jayanth";
		 Apartment.numberOfHouses = 5;
		 String[] houseName = {"Darshan", "Karuna", "Aruna", "Sumanth", "Rakshith"};
		 Apartment.location = "Rajajinagar";
		 
		 
		   System.out.println("Main method started");
		   
		   System.out.println("Apartment name is " + Apartment.name );
		   
		   System.out.println("Apartment owner is "+ Apartment.owner);
		   
		   System.out.println("numberOfHouses in Apartment are "+Apartment.numberOfHouses);
		   
		   System.out.println("House names are");
		        int size = houseName.length;
		   for(int index=0; index< size; index++){
			   System.out.println(houseName[index]);
			   
		   }
		   
		   System.out.println("The location of the Apartment is "+ Apartment.location);
		   
		   System.out.println("Main method is ended");
		 
	}


}