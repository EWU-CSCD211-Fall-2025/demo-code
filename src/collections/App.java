
package collections;

public class App {
	
	public static void main(String[] args) {
		
		RecipeSimple r = new RecipeSimple();
		
		r.addIngredient(new IngredientSimple("mozzarella", "2 cups"));
		r.addIngredient(new IngredientSimple("pepperonni", "1 cups"));
		r.addIngredient(new IngredientSimple("crust", "each"));
		
		r.sortIngredients();
		r.printIngredients();
		
		System.out.println("Do ingredients contain 2 cups mozzarella? " + r.containsIngredient(new IngredientSimple("mozzarella", "2 cups")));
		
		r.removeIngredient(new IngredientSimple("crust", "each"));
		
		r.printIngredients();
	}
}