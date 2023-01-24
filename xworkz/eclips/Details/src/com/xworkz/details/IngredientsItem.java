package com.xworkz.details;

public class IngredientsItem{

	static String[] ingredientName(String foodItem, String[] ingredients) {
		
		System.err.println("Food item "+foodItem);
		if(foodItem=="Rotti") {
			
			for(int i=0;i<ingredients.length; i++) {
				System.out.println("ingredients are :"+ingredients[i]);
				
			}
			return ingredients;
		}
		return null;
	}
}
