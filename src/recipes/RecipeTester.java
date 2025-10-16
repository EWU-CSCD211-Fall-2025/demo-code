package recipes;

public class RecipeTester {

	public static void main(String[] args) {
		
		String spaghettiName = "Spaghetti";
		String[] spaghettiIngredients = new String[] {
			"pasta", 
			"sauce", 
			"meatballs"
		};
		
		Recipe r = new Recipe(spaghettiName, spaghettiIngredients);
		
		System.out.println("Original: ");
		r.printRecipe();
		
		
		r.combineIngredients(1, 2);
		
		System.out.println(); // empty newline
		
		System.out.println("After combining ingredients: ");
		r.printRecipe();

	}

}
