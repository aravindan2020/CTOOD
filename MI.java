
public class MI extends IPL {
	String players,coach;
	float statictics;
	public MI(float points, float nrr, String oc, String pc, String players, String coach, float statictics) {
		super(points, nrr, oc, pc);
		this.players = players;
		this.coach = coach;
		this.statictics = statictics;
	}
	void thridumpire()
	{
		System.out.println("represented match from MI to other teams");
	}
	void display()
	{
		super.thridumpire();
		thridumpire();
	}
	@Override
	public String toString() {
		return "MI [players=" + players + ", coach=" + coach + ", statictics=" + statictics + "]";
	}
	
	

}
