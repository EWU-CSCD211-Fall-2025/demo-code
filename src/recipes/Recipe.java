package recipes;

public class Recipe implements IRecipe {
	
	private String name;
	private String[] ingredients;
	
	public Recipe(String name, String[] ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	@Override
	public void combineIngredients(int i, int j) {
		
		String combined = ingredients[i] + " - " + ingredients[j];
		
		String[] combinedIngredients = new String[ingredients.length - 1];
		
		// helper variables
		int c = 0;
		int len = ingredients.length;
		
		// the main for loop
		for (int k = 0; k < len; k++) {
			if (k == i) { // set the ith position in the array to the combined ingredient
				
				combinedIngredients[c++] = combined;
				
			} else if (k != j) { // then skip the jth
				
				combinedIngredients[c++] = ingredients[k];
				
			}
		}
		
		ingredients = combinedIngredients; // don't forget to update the state!

	}
	
	@Override
	public void printRecipe() {
		System.out.println("Recipe: " + name);
		System.out.println("Ingredients: ");
		for (int i = 0; i < ingredients.length; i++) {
			System.out.println(" - " + ingredients[i]);
		}
	}

}
