package demo2.best;

public class ChillingBehavior implements IBehavior {
	
	private int chillingTime;

	public ChillingBehavior(int chillingTime) {
		this.chillingTime = chillingTime;
	}
	
	public int getChillingTime() {
		return chillingTime;
	}

	@Override
	public void recipeBehavior(Recipe r) {
		System.out.println("Chilling recipoe " + r.format('|') + " for " + getChillingTime() +  " minutes.");
	}

}
