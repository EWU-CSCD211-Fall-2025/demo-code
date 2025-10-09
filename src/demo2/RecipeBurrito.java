package demo2;

public class RecipeBurrito extends Recipe {

	public RecipeBurrito(String name, String ingredients) {
		super(name, ingredients);
		// TODO Auto-generated constructor stub
	}
	
	
	public void wrapBurrito() {
		System.out.println("Wrapping burrito with ingredients " + getIngredients());
		setName("wrapped burrito!");
	}

}
