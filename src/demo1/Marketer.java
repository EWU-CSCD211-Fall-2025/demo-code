package demo1;

public class Marketer extends Employee {
	
	public Marketer(int years, String name) {
		super(years, name);
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return super.getSalary() + 10000.0;
	}

}
