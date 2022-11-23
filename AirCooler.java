class AirCooler{

     static String brandName = "Samsung";
	 static String frequency = "";
	 static  boolean isConnected ;
	 static int minTemperature ;
	 static int maxTemperature = 10 ;
	 static int currentTemperature ;
	 
	 
	 public static void onOrOff(){
		 System.out.println("Inside the onOrOff method");
		 if(isConnected == false){
		    isConnected = true;
			System.out.println("The Air Cooler is turned on");	
	 }
	 else if(isConnected == true){
		 isConnected = false ;
		 System.out.println("The Air Cooler is turned off");
		 System.out.println("onOrOff Method is ended");
	 } 
	 }
       
	    public static void increaseTemperature(){
		System.out.println("increaseTemperature method is started");
         if (isConnected == true){
		 if(currentTemperature < maxTemperature ) {
			 currentTemperature = currentTemperature+1;
			 System.out.println("The current temperature "+ currentTemperature);
		 }
		 else{
			  System.out.println("maxTemperature reached");
		 } 
		 }else {
			 System.out.println("manga turn on the cooler");
		 }		
			
		}
		
		public static void decreaseTemperature(){
			System.out.println("decreaseTemperature method is started");
			if(isConnected == true){
			if(currentTemperature > minTemperature){
			currentTemperature = currentTemperature-1;
           System.out.println("The current temperature is :"+currentTemperature);			
			}	
			else{
				System.out.println("Minimum temperature is reached");
			}
			}else{
				System.out.println("first turn on the cooler");
			}
		}
	   
	   
      public static void main(String a[]){
		  
		  System.out.println("Main method is started");
		  onOrOff();
		  increaseTemperature();
		  increaseTemperature();
		  increaseTemperature();
		  decreaseTemperature();
		   decreaseTemperature();
		    decreaseTemperature();
			increaseTemperature();
			increaseTemperature();
		  onOrOff();
		  System.out.println("Main method is ended");
		  
	  }




}