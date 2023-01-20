class Fish{

     static void sell(double price){
	 
	   System.out.println("Inside sell method");
	   
	   if(price<0){
	      return;
	   }
	   
	   if(price>500 && price<1000){
	   System.out.println("I will not buy");
	   }
	   
	   if(price==80){
	   System.out.println("I will buy");
	   }
	   
	   if(price>80 && price<500){
	   System.out.println("I will think");
	   }
	   
	   if(price>1000){
	   System.out.println("I will not eat fish only");
	   }
	 }
	 
	 
	 static void cook(String fish , String[] ingredients){
	 
	 System.out.println("Inside cook method");
	 
	   System.out.println(fish);
	   
	   if(ingredients == null){
		   //return;
	   }
	   
	   if(fish == null){
		   //return;
	   }
	   
	   for(int i=0; i<ingredients.length; i++){
		    //System.out.println("Ingredients are");
		   System.out.println("ingredients are :" +ingredients[i]);
	   }
	   
	   
	  System.out.println("Outside cook method"); 
       
	 }
	 
	 static void die(int year, int month, int date){
		 
		  System.out.println("Inside die method");
		 
		 if(year <0 | month<0 | date<0){
			 return;
		 }
		 
		 if(year > 2023 | year< 2000){
			 return;
		 }
		 
		 if(month>12){
			 
			 return;
		 }
		 if(date>31){
			 return;
		 }
		 
		 
		   System.out.println("Outside die method");
	 }
}