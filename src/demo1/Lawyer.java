package demo1;

public class Lawyer extends Employee {
	
	@Override
	public int getVacationDays() {
		return 21;
	}
	
	public String getVacationForm() {
		return "pink";
	}
	
	public void sue() {
		System.out.println("I'm suing you.");
	}

}
