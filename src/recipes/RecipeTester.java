package recipes;

import java.io.FileReader;

public class RecipeTester {

	public static void main(String[] args) {
				
		String spaghettiName = "Spaghetti";
		String[] spaghettiIntialIngredients = new String[] {
			"pasta", 
			"sauce", 
			"meatballs"
		};
		
		Recipe r = new Recipe(spaghettiName, 2, spaghettiIntialIngredients);
		
		System.out.println("Original: ");
		r.printRecipe();
		
		// combine pasta and sauce from step stepToCombine 
		// into step stepToCombine + 1 of the recipe
		// throwing exceptions if needed if the indices are out of bounds
		// or if the same ingredient is being combined with itself
		//
		int stepToCombine = 0;
		r.combineIngredients(1, 2, stepToCombine); 
		
		System.out.println(); // empty newline
		
		System.out.println("After combining ingredients: ");
		r.printRecipe();

	}

}
