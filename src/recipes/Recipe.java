package recipes;

public class Recipe implements IRecipe {
	
	
	private String name;
	private String[][] ingredients;
	
	public Recipe(String name, int numSteps, String[] initialIngredients) {
		this.name = name;
		this.ingredients = new String[numSteps][];
		ingredients[0] = initialIngredients;
	}

	/**
	 * Combine ingredients from step step of recipe
	 * @param i the first ingredient to combine
	 * @param j the second ingredient to combine
	 * @param step the step of the recipe to combine ingredients from
	 * @throws IndexOutOfBoundsException if i or j are out of bounds
	 * @throws IllegalArgumentException if i and j are the same
	 */
	@Override
	public void combineIngredients(int i, int j, int step) throws IndexOutOfBoundsException, IllegalArgumentException {
		
		if ((step < 0 || step >= ingredients.length - 1) ||
			(i < 0 || i >= ingredients[step].length) ||
			(j < 0 || j >= ingredients[step].length)
			) {
			throw new IndexOutOfBoundsException("Ingredient index i, j, step out of bounds.");
		}
		if (i == j) {
			throw new IllegalArgumentException("Cannot combine ingredient with itself.");
		}
		
		String combined = ingredients[step][i] + " - " + ingredients[step][j];
		
		String[] combinedIngredients = new String[ingredients[step].length - 1];
		
		// helper variables
		int c = 0;
		int len = ingredients[step].length;
		
		// the main for loop
		for (int k = 0; k < len; k++) {
			if (k == i) { // set the ith position in the array to the combined ingredient
				
				combinedIngredients[c++] = combined;
				
			} else if (k != j) { // then skip the jth
				
				combinedIngredients[c++] = ingredients[step][k];
				
			}
		}
		
		ingredients[step + 1] = combinedIngredients; // don't forget to update the state!

	}
	
	@Override
	public void printRecipe() {
		System.out.println("Recipe: " + name);
		for (int i = 0; i < ingredients.length; i++) {
			System.out.println("Step: " + (i + 1));
			
			if (ingredients[i] != null) {
				for (int j = 0; j < ingredients[i].length; j++) {
					System.out.println(" - " + ingredients[i][j]);
				}
			}
		}
	}

}
