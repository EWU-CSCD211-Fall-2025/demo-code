
package demo2;

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
				
				String name = parts[0].trim();
				String ingredients = parts[1].trim();
				
				recipes.add(new Recipe(name, ingredients));
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		for (Recipe r : recipes) {
			System.out.println(r.getName() + " > " + r.getIngredients());
		}

	}

}
