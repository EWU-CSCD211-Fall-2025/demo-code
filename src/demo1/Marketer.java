package demo1;

public class Marketer extends Employee {
	
	public Marketer(int years) {
		super(years);
		// TODO Auto-generated constructor stub
	}

	public double getSalary() {
		return super.getSalary() + 10000.0;
	}

}
