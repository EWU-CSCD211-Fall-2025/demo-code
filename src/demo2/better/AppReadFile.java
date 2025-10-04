
package demo2.better;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppReadFile {

	public static void main(String[] args) {
		
		List<Recipe> recipes = new ArrayList<>();


		try (BufferedReader br = new BufferedReader(new FileReader("recipes.txt"))) {
			
			String line;
			
			while ((line = br.readLine()) != null) {
				
				String[] parts = line.split(":");
				
				if (parts.length == 2) {
				
					String name = parts[0].trim();
					String ingredients = parts[1].trim();
					
				
					if (name.equals("Fried Rice") || name.equals("Cake")) {
						recipes.add(new RecipeBaking(name, ingredients, 20, 300));
					
					} else {
						recipes.add(new RecipeChilling(name, ingredients, 30));
					}
				}
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		for (Recipe r : recipes) {
			r.makeRecipe();
			System.out.println();
		}
		
	}

}
