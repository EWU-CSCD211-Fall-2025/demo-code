package demo1;

public class Apartment extends House {

	public Apartment() {
        super("concrete", 2);
    }
   
    public static void main(String[] args) {
        House h = new House();
        h.getClean();
        Apartment a = new Apartment();
        a.getClean();
    }
}


