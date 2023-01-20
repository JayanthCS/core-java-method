class Swiggy{

      public static double  findItem(String item){
	  System.out.println("invoked findItem()");
	  
	  if(item == "Roti"){
	    return 30.00 ;
	  }
	  else{
	  System.out.println("The item is not available");
	  }
	  
	  System.out.println("end of findItem()");
	  return 0.0 ;
	  }




}