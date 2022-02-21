package inheritance2;

public class A1 {
	int a,b=12;
	A1()
	{
		System.out.println("super class constructor");
	}
	A1(int a)
	{
		System.out.println(a);
	}
	A1(double b)
	{
		System.out.println(b);
	}

	//@override
	void CSE()
{
	System.out.println("this is super class method");
}
}
