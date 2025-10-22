package javadoc;

/**
 * This class represents an Ingredient
 * 
 * To generate the javadoc documentation, see
 * 
 * https://docs.oracle.com/en/java/javase/25/docs/specs/man/javadoc.html
 * 
 * e.g. 
 * 
 * javadoc -d outputdir packagename 
 * 
 */
public class Ingredient extends Object {
	
	private String name; // cheese, bread, garlic
	private String measurementUnit; // oz, lbs, teaspoons
	
	/**
	 * Constructs a new Ingredient
	 * @param name the name of the ingredient
	 * @param measurementUnit the unit, e.g. oz, lbs, teaspoons
	 */
	public Ingredient(String name, String measurementUnit) {
		this.name = name;
		
		/*
		 * This is not a javadoc comment.
		 * It is a regular multiline comment
		 * notice the forward-slash single star vs double star
		 */
		this.measurementUnit = measurementUnit;
	}
	
	/**
	 * Returns the name of the ingredient
	 * @return name the string representation of the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns the measurement unit
	 * @return measurementUnit the measurement unit
	 */
	public String getMeasurementUnit() {
		return measurementUnit;
	}
	
	/**
	 * Overriding the toString method
	 * @return String the String representation of the method
	 */
	@Override
	public String toString() {
		return getName() + " " + getMeasurementUnit();
	}
	
	/**
	 * equals rules:
	 * 1) if o is null, return false
	 * 2) if o is not an instance of a Ingredient, return false
	 * 3) else if it is, return conditions that make it equal
	 */
	@Override
	public boolean equals(Object o) {
		
		if (o == null) {
			return false;
		} else if (!(o instanceof Ingredient)) {
			return false;
		} else {
			Ingredient other = (Ingredient) o;
			
			
			return other.name.equals(name) && other.measurementUnit.equals(measurementUnit);
		}
		
	}
	
	/**
	 * if two instances of a class are equal, 
	 * then their hashCode return values are equal
	 */
	@Override
	public int hashCode() {
		return name.hashCode() + measurementUnit.hashCode();
		
	}

}
