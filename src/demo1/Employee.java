package demo1;

public class Employee {
	
	private int years;
	private String name;
	
	public Employee(int years, String name) {
		this.years = years;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Employee Name: " + name + ", Number of year worked: " + years;
	}

}
