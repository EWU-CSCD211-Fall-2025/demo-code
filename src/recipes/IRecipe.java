package recipes;

public interface IRecipe {
	
	public void combineIngredients(int i, int j, int step) throws IndexOutOfBoundsException, IllegalArgumentException;
	public void printRecipe();
}
