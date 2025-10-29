
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
//		Point2D point = new Point3D(1, 2, 3);
//		System.out.println("can't do this: z=" + point.getZ());
		
//		List<Integer> list = new LinkedList<>();
//		list.add(2);
//		list.add(3);
//		System.out.println("list: "  + list);
		
//		String s = "cbc";
//		int i = s.compareTo("bbc");
//		System.out.println("i = " + i);
		
//		RecipeSimple r = new RecipeSimple();
//		
//		r.addIngredient(new IngredientSimple("mozzarella", "2 cups"));
//		r.addIngredient(new IngredientSimple("pepperonni", "4 cups"));
//		r.addIngredient(new IngredientSimple("pepperonni", "3 cups"));
//		r.addIngredient(new IngredientSimple("crust", "each"));
//		
//		r.printIngredients();
//		r.sortIngredients();
//		r.printIngredients();
//		
//		System.out.println("Do ingredients contain 2 cups mozzarella? " + 
//		r.containsIngredient(new IngredientSimple("mozzarella", "2 cups")));
////		
//		r.removeIngredient(new IngredientSimple("crust", "each"));
//		
//		r.printIngredients();
		
		String[] arr1 = new String[] {"abc", "xyz", "c", "c++"};
		String[] arr2 = new String[] {"abc", "xyz"};
		
		// are all elements in arr2 contained in arr1
		
		boolean allContains = true;
		for (int i = 0; i < arr2.length; i++) {
			
			String element2 = arr2[i];
			
			boolean contains = false;
			
			for (int j = 0; j < arr1.length; j++) {
				String element1 = arr1[j];
				if (element1.equals(element2)) {
					contains = true;
				}
			}
			if (!contains) {
				allContains = false;
			}
			
		}
		System.out.println("are all elements in arr2 in arr1? " + allContains);
		
	}
}