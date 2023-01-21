class FishTester{

    public static void main(String [] a){
	
	System.out.println("Inside main method");
	    int price1 = 0;
		Fish.sell(price1);
		
		int price2 = 650;
	    Fish.sell(price2);
		
		int price3 = 80;
		Fish.sell(price3);
		
		int price4 = 350;
		Fish.sell(price4);
		
		int price5 = 1300;
		Fish.sell(price5);
		
		
		String fish = "star fish";
		//Fish.cook(fish);
		
		String [] ingredients = {"masala", "water", "fish", "uppu", "karapudi"};
		Fish.cook(fish,ingredients);
		
		int year1 = -1;
		int month1 =13;
		int date1  = 32;
		Fish.die(year1,month1,date1);
		
	
	System.out.println("Outside main method");
	}

}