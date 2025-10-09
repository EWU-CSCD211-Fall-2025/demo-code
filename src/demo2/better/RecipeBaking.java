package demo2.better;

public class RecipeBaking extends Recipe implements IBakeable {
	
	private int bakingTime;
	private int ovenTemp;

	public RecipeBaking(String name, String ingredients, int bakingTime, int ovenTemp) {
		super(name, ingredients);
		this.bakingTime = bakingTime;
		this.ovenTemp = Math.max(MAXTEMP, bakingTime);
	}
	
	public int getBakingTime() {
		return bakingTime;
	}
	
	public int getOvenTemp() {
		return ovenTemp;
	}

	@Override
	public void bake() {
//		super.printRecipe();
		System.out.println("Baking recipe [" + format('|') + "] for " + getBakingTime() + " minutes at " + getOvenTemp() + " degrees F");
	}

	@Override
	public void makeRecipe() {
		super.prepare();
		bake();
	}
	
}
