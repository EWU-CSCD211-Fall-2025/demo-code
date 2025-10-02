package demo2;

/**
* Represents a recipe with a name and ingredients.
*/
public class Recipe {
	
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
	 * @return the recipe name 
	 * */
	public String getName() { 
		return name;
	}
	
	/** 
	 * @return the recipe ingredients 
	 * */
	public String getIngredients() {
		return ingredients; 
	}
	
	public static void main(String[] args) {
		
    }
}
