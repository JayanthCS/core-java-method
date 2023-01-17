class ShopRunner{

    public static void main(String [] a){
	
	    String item = "Head Phone";
		int    price= 999;
        String brand = "Boat";		
       
	   Shop.buy(item,price,brand);
	   
	   String itemName = "Head phone";
       String itemBrand = "Mi";
	    Shop.exchange(itemName,itemBrand);
		
	}	
}