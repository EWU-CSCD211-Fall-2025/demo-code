package demo2.better;

public interface IRecipe {
	
	void makeRecipe();
	
	default void printRecipe() {
		System.out.println("this: " + this);
	}

}
