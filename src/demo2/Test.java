package demo1;    
    
public class Test extends Building{
    public static void main(String[] args) {
        House h = new House();
        h.getClean();
        Apartment a = new Apartment();
        a.getClean();
    }
}