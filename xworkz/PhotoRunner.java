class PhotoRunner{

     public static void main(String [] a){
	 
	     System.out.println("Inside main method");
		 
		 System.out.println("Size is :"+Photo.size);
		 System.out.println("pixel is: "+Photo.pixel);
		 System.out.println("colour is :"+Photo.coloured);
		 System.out.println("Type is :"+Photo.type);
		 System.out.println("photo is :"+Photo.clear);
		 
		 System.out.println("initialisation started");
		 
		 Photo.size = 30;
		 Photo.pixel =140f;
		 Photo.coloured ="White";
		 Photo.type ="Big";
		 Photo.clear ="No";
		 
		 System.out.println("Size is :"+Photo.size);
		 System.out.println("pixel is: "+Photo.pixel);
		 System.out.println("colour is :"+Photo.coloured);
		 System.out.println("Type is :"+Photo.type);
		 System.out.println("photo is :"+Photo.clear);
		 
		 System.out.println("initialisation ended");
		 
		 System.out.println("Outside main method");
	 }
}