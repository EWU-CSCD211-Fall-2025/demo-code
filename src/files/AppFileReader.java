package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AppFileReader {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "recipes.txt";
		
		File file = new File(fileName);
		
		FileReader fr = new FileReader(file);
		
		if (file.exists()) {
			
			int i = 0;
			while ((i = fr.read()) != -1) {
				
				System.out.println("(char)i = " + (char)i);
			}
			
		}
		
		
		fr.close();
		
	}

}
