package arraylist;

public class AppArrayOfStrings {

	public static void main(String[] args) {
				
		String[] stringArr = new String[5]; // set capacity when we declare and allocate array
		
		stringArr[2] = "a string";
		
		
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println("stringArr[i]: " + stringArr[i]);
		}

	}

}
