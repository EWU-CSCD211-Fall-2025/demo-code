package demo1;

public class Lawyer extends Employee {
	
	public Lawyer() {
		super(0);
		System.out.println("init");
	}
	
	
	
	@Override
	public double getSalary() {
		return 20000 + super.getSalary();
	}
	
	
	public Lawyer(int years) {
		super(years);
		System.out.println("init");
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

}
