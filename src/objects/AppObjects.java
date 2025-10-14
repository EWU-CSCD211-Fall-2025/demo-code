package objects;

public class AppObjects {
	
	
	public static void main(String[] args) {
		
		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		
		String s1 = "1";
		String s2 = "1";
		
		System.out.println("p1 == p2? " + (p1.equals(p2)));
		System.out.println("s1 == s2? " + (s1.equals(s2)));
		
	}
	
	
}
