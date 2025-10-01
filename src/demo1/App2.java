package demo1;

public class App2 {

	public static void main(String[] args) {
		Lawyer bestLawyer = new Lawyer();
		Secretary s = new Secretary();
		System.out.println("Secretary vacation days: " + s.getVacationDays());
		System.out.println("Lawyer vacation days: " + bestLawyer.getVacationDays());
		
		bestLawyer.sue();
		System.out.println("Lawyer vacaction form: " + bestLawyer.getVacationForm());
		
		Marketer m = new Marketer();
		
		System.out.println("marketer salary: " + m.getSalary());
	}

}
