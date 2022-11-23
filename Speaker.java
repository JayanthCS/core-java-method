class Speaker{

    static String brandName = "Bose";
	static String frequency = ""; 
	static boolean isWireLess = true ;
	static boolean isConnected ;
	static int minVolume ;
	static int maxVolume = 6;
	static int currentVolume ;
	
	
	public static void onOrOff(){
	   System.out.println("inside onOrOff method");
	   
	   if(isConnected == false){
	      isConnected = true ;
	    System.out.println("The speaker is turned on... enjoy");
		
	  }else if(isConnected == true){
	           isConnected = false;
	    System.out.println("The speaker is turned off");
		System.out.println("onOrOff method is ended");
	  }
	
	} 
	
	     public static void increaseVolume(){
			 System.out.println("invoked increase method");
			 System.out.println("No of Parameters:"+ 0);
			 if(isConnected == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume+1 ;
				System.out.println("The current volume is"+currentVolume);
			}
            else{
				System.out.println("max volume reached");
			}			
				 
			 }else{
				 System.out.println("Gubeee... First turn on the speaker");
			     System.out.println("Increase method is ended");
			 }
			 
		 }
	
	     public static void decreaseVolume(){
			 System.out.println("invoked decreaseVolume Method");
			 System.out.println("No of parameters:"+ 0);
			 if (isConnected == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume - 1;
				System.out.println("The current volume is  " + currentVolume);
				
			}	
             else{
				 System.out.println("min volume reached");
			 } 			
			 }
		 }
		 
       public static void main(String speaker[]){
	        System.out.println("main method started");
			onOrOff();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			increaseVolume();
			decreaseVolume();
			decreaseVolume();
			decreaseVolume();
			decreaseVolume();
			decreaseVolume();
			decreaseVolume();
			decreaseVolume();
			onOrOff();
			increaseVolume();
	        System.out.println("main method is ended");
	   }



}