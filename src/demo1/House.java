package demo1;

public class House extends Building {

	public House() { 
		super("wood", 4); //makes house wood a
						  //makes house have 4 windows
    }

	public House(String material, int windows) { 
		super(material, windows);
		
	}

}
