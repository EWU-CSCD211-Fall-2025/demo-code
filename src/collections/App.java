
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		Point2D point = new Point3D(1, 2, 3);
//		System.out.println("can't do this: z=" + point.getZ());
		
//		List<Integer> list = new LinkedList<>();
//		list.add(2);
//		list.add(3);
//		System.out.println("list: "  + list);
		
		
		RecipeSimple r = new RecipeSimple();
		
		r.addIngredient(new IngredientSimple("mozzarella", "2 cups"));
		r.addIngredient(new IngredientSimple("pepperonni", "1 cups"));
		r.addIngredient(new IngredientSimple("crust", "each"));
		
		r.sortIngredients();
		r.printIngredients();
		
		System.out.println("Do ingredients contain 2 cups mozzarella? " + r.containsIngredient(new IngredientSimple("mozzarella", "2 cups")));
		
		r.removeIngredient(new IngredientSimple("crust", "each"));
		
		r.printIngredients();
	}
}