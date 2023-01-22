class Singer{

    static String name;
	static String from;
	static String profession;
	static int age;
	static String qualification;
	
	
	static void initialsingVariables(String arg1, String arg2,String arg3, int arg4 , String arg5){
	
	    name = arg1;
		from = arg2;
		profession = arg3;
		age = arg4;
		qualification = arg5;
	
	}
	
	static void display(){
	
	System.out.println("Inside display()");
	
	System.out.println(name);
	System.out.println(from);
	System.out.println(profession);
	System.out.println(age);
	System.out.println(qualification);
	
	
	
	System.out.println("Outside display()");
	
	}


}