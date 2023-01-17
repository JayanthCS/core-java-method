class Shop{
  
  
  static void buy(String item, int price, String brand){
	  
	  System.out.println("Start buying method");
	  
	  System.out.println(item);
	  System.out.println(brand);

      if(price>1000){
		  
		  System.out.println("price is costly");
	  }
	  
	  if(500<price & price<1000){
		  
		  System.out.println("PRICE IS Expensive");
	  }
	  
	  if(price<500){
		  
		  System.out.println("price is ok");
	  }
	  System.out.println("end buying method");
  }
  
  static void exchange(String itemName, String itemBrand){
	  System.out.println("Exchange product satart");
	  System.out.println(itemName);
	  System.out.println(itemBrand);
	  
	  System.out.println("Exchange product end");
  }

}