package arraylist;

import java.util.ArrayList;

public class AppArrayList {

	public static void main(String[] args) {
		
		// String[] 
		
		String[] stringArr = new String[5]; // set capacity when we declare 
		
		stringArr[2] = "a string";
		
		
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println("stringArr[i]: " + stringArr[i]);
		}
		
		
		// ArrayList<String>
		
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("string 1");
		stringList.add("string 2");
		
		System.out.println("stringList: " + stringList);
		
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println("stringList.get(i): " + stringList.get(i));
		}

	}

}
