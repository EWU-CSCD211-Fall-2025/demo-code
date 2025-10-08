package files;

import java.io.File;

public class AppFile {
	
	public static void main(String[] args) {
		
		String fileName = "recipes.txt";
		
		File file = new File(fileName);
		
		System.out.println("file absolute path: " + file.getAbsolutePath());
		
		System.out.println("Does the file exist? " + file.exists());
		
	}

}
