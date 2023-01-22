class  MovieRunner{
	
	public static void main(String [] a){
		
		System.out.println("Inside main method");
		
		Movie.display();
		System.out.println("......");
		
		Movie.initialisingVariable("kranthi",5000000F,"Harikrishna","Darshan","Rachitha",5);
		Movie.display();

		
		System.out.println("Outside main method");
		
	}
	
}