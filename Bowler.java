package Array1;

public class Bowler extends Cricketplayer {
	int wicket;

	public Bowler(String name, int age, int wicket) {
		super(name, age);
		this.wicket = wicket;
	}
	public void info()
	{
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(wicket);
		
	}

}
