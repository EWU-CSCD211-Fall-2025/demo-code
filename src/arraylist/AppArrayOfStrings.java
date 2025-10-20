package arraylist;

public class AppArrayOfStrings {

	public static void main(String[] args) {
				
		String[] arr = new String[5]; // set capacity when we declare and allocate array
		int[] intArr = new int[5];
		
		String s = "java is fun";
		arr[2] = s;
		System.out.println(s);
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[i]: " + arr[i]);
		}

	}

}
