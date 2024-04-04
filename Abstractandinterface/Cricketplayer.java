package Abstractandinterface;

public abstract class Cricketplayer {
	String name;
	int age;
	public Cricketplayer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void displayage()
	{
		System.out.println(age);
	}
	abstract void info();

}
