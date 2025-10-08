package exceptions;

public class AppCatch {

	public static void main(String[] args) { // does not throw any exception. We catch them!
		
		try {
			
			throw new Exception();
			
		} catch (Exception e) {
			
			System.out.println("Caught " + e.toString() +  "!");
			
		}
		

	}

}
