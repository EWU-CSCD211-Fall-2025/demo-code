package demo1;

public class Secretary extends Employee {
	
	public Secretary(int years) {
		super(years);
		// TODO Auto-generated constructor stub
	}

	public void takeDictation() {
		System.out.println("taking dication");
	}
	
	@Override
	public int getVacationDays() {
		return 5;
	}

}
