package Array1;

public class Batsman extends Cricketplayer {
	int runs;

	public Batsman(String name, int age, int runs) {
		super(name, age);
		this.runs = runs;
	}
	public void info()
	{
		System.out.println(super.name);
		System.out.println(super.age);
		System.out.println(runs);
	}

}
