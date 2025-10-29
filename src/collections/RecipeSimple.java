package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecipeSimple {
	
	private List<IngredientSimple> ingredients;
	
	public RecipeSimple() {
		ingredients = new ArrayList<>();
	}
	
	public void addIngredient(IngredientSimple i) {
		ingredients.add(i);
	}
	
	public void sortIngredients() {
		Collections.sort(ingredients);
	}
	
	public void printIngredients() {
		System.out.println(ingredients);
	}
	
	public boolean containsIngredient(IngredientSimple i) {
		return ingredients.contains(i);
	}

	public void removeIngredient(IngredientSimple i) {
		ingredients.remove(i);
	}

}
