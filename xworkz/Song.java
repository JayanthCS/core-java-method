class Song{

    static String name;
	static  String singer;
	static String language;
	static String duration;
	
	static void initialsingVariables(String arg1, String arg2, String arg3, String arg4){
	
	      name = arg1;
		  singer = arg2;
		  language = arg3;
		  duration = arg4;
	
	}
	
	static void display(){
	System.out.println("inside display()");
	
	System.out.println(name);
	System.out.println(singer);
	System.out.println(language);
	System.out.println(duration);
	
	System.out.println("outside display()");
	}


}