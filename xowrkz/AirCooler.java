class AirCooler{

    static void increaseSpeed(int speed){
	
	    System.out.println("Inside increaseSpeed method");
		
		if(speed ==5){
		
		  System.out.println("cannot increase more");
		  
		}
		
		if(speed<=0 || speed >5){
		
		System.out.println("invalid speed");
		}
		System.out.println("outside increaseSpeed method");
	}
	
	static void decreaseSpeed(int speed){
		
		System.out.println("Inside decreaseSpeed method");
		
		if(speed<=0 || speed >5){
		System.out.println("invalid speed");
		}
		
		System.out.println("Outside decreaseSpeed method");
		
	}
	
	static void changeProgram(String program){
		
		System.out.println("Inside changeProgram method");
		
		if(program ==null || program != "Summer"| program!="Winter"| program!= "Rain"){
			
			System.out.println("invalid program");
			
			
		}
		System.out.println("Outside changeProgram method");
	}
	
	static void increaseTemp(int temp){
		
		System.out.println("Inside increaseTemp method");
		
		if(temp>32){
			System.out.println("invalid temp");
		}
		
		//if(temp<0){
			//System.out.println("invalid temperature");
		//}
	System.out.println("Outside increaseTemp method ");	
	}
	
	static void decreaseTemp(int temp){
		
		System.out.println("Inside decreaseTemp method");
		
		if(temp<0){
			System.out.println("invalid temp");
		}
		System.out.println("Outside decreaseTemp method");
	}
}