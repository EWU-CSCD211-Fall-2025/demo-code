package demo2.better;

public class RecipeChilling extends Recipe implements IChillable {
	
	private int chillingTime;

	public RecipeChilling(String name, String ingredients, int chillingTime) {
		super(name, ingredients);
		this.chillingTime = chillingTime;
	}
	
	public int getChillingTime() {
		return chillingTime;
	}

	@Override
	public void chill() {
		System.out.println("Chilling recipoe " + format('|') + " for " + getChillingTime() +  " minutes.");
	}
	
	@Override
	public void makeRecipe() {
		super.prepare();
		chill();
	}

}
