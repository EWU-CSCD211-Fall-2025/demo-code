package collections;

public class IngredientSimple implements Comparable<IngredientSimple> {
	
	private String name;
	private String amount;
	
	public IngredientSimple(String name, String amount) {
		this.name = name;
		this.amount = amount;
	}
	
//	public int distanceTo(IngredientSimple o) {
//		// return the number of steps from this to o
//	}

	@Override
	public int compareTo(IngredientSimple o) {
		
		int compare1 = name.compareTo(o.name);
		
		if (compare1 < 0) {
			return -1;
		} else if (compare1 > 0) {
			return 1;
		} else {
			return amount.compareTo(o.amount);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else {
			if (o instanceof IngredientSimple) {
				IngredientSimple other = (IngredientSimple) o;
				return other.name.equals(name) && other.amount.equals(amount);
			} else {
				return false;
			}
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + amount.hashCode();
	}
	
	@Override
	public String toString() {
		return name + " (" + amount + ")";
	}

}
