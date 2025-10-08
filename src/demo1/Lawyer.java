package demo1;

public class Lawyer extends Employee {
	
	public Lawyer() {
		super(0, "default name");
		System.out.println("init");
	}
	
	public Lawyer(int years, String name) {
		super(years, name);
		System.out.println("initializing Lawyer");
	}
	
	@Override
	public double getSalary() {
		return 20000 + super.getSalary();
	}
	
	
	
	
	@Override
	public int getVacationDays() {
		return 21 + getYears();
	}
	
	public String getVacationForm() {
		return "pink";
	}
	
	public void sue() {
		System.out.println("I'm suing you because I have " + getYears() + " years of experience.");
	}
	
	public String toString() {
		return super.toString() + ", Salary: " + getSalary();
	}

}
