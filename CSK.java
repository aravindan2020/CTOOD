
public class CSK extends IPL{
	String players,coach;
	float statistics;
	public CSK(float points, float nrr, String oc, String pc, String players, String coach, float statistics) {
		super(points, nrr, oc, pc);
		this.players = players;
		this.coach = coach;
		this.statistics = statistics;
	}
	void thridumpire()
	{
		System.out.println("represented match");
	}
	void display()
	{
		super.thridumpire();
		thridumpire();
	}
	@Override
	public String toString() {
		return "CSK [players=" + players + ", coach=" + coach + ", statistics=" + statistics + "]";
	}
	
	
	

}
