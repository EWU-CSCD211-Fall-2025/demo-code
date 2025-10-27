package collections;

public class IngredientSimple implements Comparable<IngredientSimple> {
	
	private String name;
	private String amount;
	
	public IngredientSimple(String name, String amount) {
		this.name = name;
		this.amount = amount;
	}

	@Override
	public int compareTo(IngredientSimple o) {
		
		return name.compareTo(o.name);
	}

}
