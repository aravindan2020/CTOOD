package Abstractandinterface;

public class Allrounder implements Bowler1,Batsman1 {
	String name;
	int runs,wicket,age;

	@Override
	public void batsmanperformance(String name,int age,int runs) {
		this.name=name;
		this.age=age;
		this.runs=runs;
	}

	@Override
	public void blowingperformance(String name,int age,int wicket) {
		this.name=name;
		this.age=age;
		this.wicket=wicket;
		
	}

	@Override
	public String toString() {
		return "Allrounder [name=" + name + ", runs=" + runs + ", wicket=" + wicket + ", age=" + age + "]";
	}
	

}
