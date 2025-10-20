package javadoc;

/*
 * Just a test class
 * 
 */
public class IngredientTester {

	public static void main(String[] args) {
		
		Ingredient i = new Ingredient("cheese", "1 lb");
		
		Ingredient j = new Ingredient("cheese", "1 lb");
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("i == j: " + (i == j));
		System.out.println("i.equals(j): " + i.equals(j));
		
		IngredientTypeA a = new IngredientTypeA(null, null);
		IngredientTypeB b = new IngredientTypeB(null, null);
		
		System.out.println("a.getClass(): " + a.getClass());
		System.out.println("b.getClass(): " + b.getClass());
		System.out.println("a instanceof Ingredient: " + (a instanceof Ingredient));
		

	}

}
