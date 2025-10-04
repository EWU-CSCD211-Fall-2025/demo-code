package demo1;

public class Employee {
	
	private int years;
	
	public Employee(int years) {
		this.years = years;
	}
	
	
	public int getYears() {
		return years;
	}
	
	public int  getHours() {
		return 40;
	}
	
	public double getSalary() {
		return 40000.0 + years * 1000;
	}
	
	public int getVacationDays() {
		return 10 + years;
	}
	
	public String getVacationForm() {
		return "yellow";
	}

}
