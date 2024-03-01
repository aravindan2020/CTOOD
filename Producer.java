
public class Producer extends Tollywood {
	String Script,Actor,Actress;

	public Producer(double money, String script, String actor, String actress) {
		super(money);
		Script = script;
		Actor = actor;
		Actress = actress;
	}
	void profit()
	{
		System.out.println("double of the budget");
	}
	void display()
	{
		//super.profit();
		profit();
	}
	@Override
	public String toString() {
		return "Producer [Script=" + Script + ", Actor=" + Actor + ", Actress=" + Actress + "]";
	}
	
}
