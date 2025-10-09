package demo2;

/**
* Represents a recipe with a name and ingredients.
*/
public class Recipe extends RecipeAbstract implements IRecipe, INameable {
	
	
	
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

	@Override
	public void prepare() {
		System.out.println("preparing " + getIngredients());
		
	}

	@Override
	public void setName(String name) {
		
		if (name.length() < NAME_MAX_LENGTH) {
			this.name = name;
		}
		
	}
	
	
	
}
