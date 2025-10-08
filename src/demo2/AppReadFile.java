
package demo2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppReadFile {

	public static void main(String[] args) {
		
//		throw new FileNotFoundException("my exception");
		
//		Object o = new Object();
		
		ArrayList<Recipe> recipes = new ArrayList<>();

		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.add("a string");
		stringArrayList.add("another String");
		
		ArrayList<Boolean> blist = new ArrayList<>();
		
		blist.add(true);
		blist.add(false);
		blist.set(0, false);
		System.out.println("blist at index 0 is " + blist.get(0));
		
		System.out.println("hello           1223\n\n" + " world ");
		
		// will this work?
//		ArrayList<boolean> booleanList = new ArrayList<>();
		
		try (
				
		BufferedReader br = new BufferedReader(new FileReader("recipes.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				String[] parts = line.split(":");
				
				if (parts.length == 2) {
				
					String name = parts[0].trim();
					String ingredients = parts[1].trim();
					
					recipes.add(new Recipe(name, ingredients));
					
				}
				
			}
			
		} catch (IOException e) {
			String message = e.getMessage();
//			System.out.println("Message: " + message);
//			e.printStackTrace();
			
		}
		
		// iterating:
		
		for (int i = 0; i < recipes.size(); i++) {
			Recipe r = recipes.get(i);
			System.out.println("Recipe: " + r.getName() + "; " + r.getIngredients());
		}
		System.out.println("\n is equivalent to: ");
		
		for (Recipe r : recipes) { // what is the : doing here?
			System.out.println("Recipe: " + r.getName() + "; " + r.getIngredients());
		}
		
		// will this work? why or why not?
//		for (Character c : "a string") {
//			System.out.println("Character c: " + c);
//		}
		
	}

}
