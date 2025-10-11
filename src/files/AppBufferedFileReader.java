package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AppBufferedFileReader {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "recipes.txt";
		
		File file = new File(fileName);
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		System.out.println("Line: " + line);
		
		br.close();
		fr.close();
		
	}

}
