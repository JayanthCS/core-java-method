class Theater{

    static String name;
	static float ticketPrice ;
	static String ownerName;
	static String location;
	static String type;
	
	
	static void initialisingVariables(String arg1, float arg2, String arg3,String arg4, String arg5){
		System.out.println("Inside movie method");
		
           name = arg1;
           ticketPrice= arg2;		   
		   ownerName = arg3;
		   location = arg4;
		   type = arg5;
	   System.out.println("Outside movie method");	
		
	}
	
	static void display(){
	System.out.println("Inside display method");
	
	System.out.println(name);
	System.out.println(ticketPrice);
	System.out.println(ownerName);
	System.out.println(location);
	System.out.println(type);
	
	
	
	System.out.println("Inside display method");

	}
}	