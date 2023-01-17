class AirCoolerTester{

     public static void main(String [] a){
	 
	     System.out.println("Inside main method");
		 
	 
	      int increase1 = 5;
	 
	     AirCooler.increaseSpeed(increase1);
		 
		   int increase2 = -1;
		   AirCooler.increaseSpeed(increase2);
		   
		   int decrease1 = 6;
		   AirCooler.decreaseSpeed(decrease1);
		   
		   String change = "";
		   AirCooler.changeProgram(change);
		   
		   int increase3 = 35;
		   AirCooler.increaseTemp(increase3);
		   
		   int decrease2 = -5;
		   AirCooler.decreaseTemp(decrease2);
		   
		 System.out.println("Outside main method");
		 
	 }


}