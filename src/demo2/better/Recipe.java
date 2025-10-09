package demo2.better;

/**
* Represents a recipe with a name and ingredients.
*/
public abstract class Recipe implements IRecipe {
	
	/** Recipe name. */
	private String name;
	
	/** Recipe ingredients in text form. */
	private String ingredients;

	/**
	* Constructs a Recipe.
	* @param name Recipe name
	* @param ingredients Ingredients list
	*/
	public Recipe(String name, String ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}

	/** 
	 * 
	 * This method returns the name of the recipe.
	 * 
	 * @return the recipe name 
	 * */
	public String getName() { 
		return name;
	}
	
	/** 
	 * 
	 * This method returns a ingredients, which is a list of comma separated ingredients.
	 * 
	 * @return the recipe ingredients 
	 * */
	public String getIngredients() {
		return ingredients; 
	}

	protected void prepare() {
//		IRecipe.super.printRecipe();
		System.out.println("Preparing ingredients for recipe " + format('|'));
	}
	
	protected String format(char separator) {
		return name + separator + ingredients;
	}
	
}
