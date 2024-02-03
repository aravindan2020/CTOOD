package P1;
//method overloading
//method overriding only possible in inheritance
public class Calculator {
	int add()
	{
		int a=4,b=6;
		return a+b;
	}
	float add(float a)
	{
		float b=1.0f;
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	
}
	
