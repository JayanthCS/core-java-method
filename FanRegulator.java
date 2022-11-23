class FanRegulator{

   static String brandName = "V-Gaurd";
   static boolean isConnected ;
   static int minSpeed ;
   static int maxSpeed = 5 ;
   static int currentSpeed ;
   
   public static void onOrOff(){
	System.out.println("Inside onOrOff method");
	if(isConnected == false){
	   isConnected = true;
     System.out.println("The speaker is turned on");	   
	}
	else if(isConnected == true){
		    isConnected = false ;
	  System.out.println("The speaker is turned off");
      System.out.println("onOrOff method is ended");	  
	}
   }
     
     public static void increaseSpeed(){
		 System.out.println("Invoked increase method");
		 if(isConnected == true){
		 if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed + 1;
         System.out.println("The current speed of fan is "+ currentSpeed);			
		 }  
		 else{
			 System.out.println("Max speed is reached");
		 }
		 }
		 else {
			 System.out.println("The fan switch is off please turn on the fan");
		 }
	 }
           
		   public static void decreaseSpeed(){
			   System.out.println("Invoked Decrease method");
			   if(isConnected == true){
			   if(currentSpeed > minSpeed){
				  currentSpeed = currentSpeed -1;
                System.out.println("the current speed is "+ currentSpeed);				  
			   }
			   else{
				   System.out.println("min speed is reached or fan is off");
			   }
			   }
			   else {
				   System.out.println("First turn on the fan switch");
			   }
		   }
		   
		   public static void main(String a[]){
			   
			   System.out.println("Main method started");
			   onOrOff();
			   increaseSpeed();
			   decreaseSpeed();
			   decreaseSpeed();
			   increaseSpeed();
			   onOrOff();
			   System.out.println("Main method ended");
			   }

}