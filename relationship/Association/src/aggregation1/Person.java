package aggregation1;

public class Person {
	 private String name;
	 Adhar a1;
	 Mobilenumber m;
	@Override
	public String toString() {
		return "Person [name=" + name + ", a1=" + a1 + "]";
	}
public Person(String name,Mobilenumber m,long adharno)
{
	this.name=name;
	this.m=m;
	this.a1 = new Adhar(adharno);
}
}
