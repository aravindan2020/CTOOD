package constructor1;

public class construct {
	
	construct()
	{
	this(56.75);
	System.out.println("this is the constructor block");
	}
	construct(double a) 
	{
		this(5);
		System.out.println("this is the parameterized constructor  "+a);
	}
	construct(int a) 
	{
		this(3,4);
		System.out.println("this is the parameterized constructor  "+a);
	}
	construct(int a,int b) 
	{
		System.out.printf("this is the parameterized constructor %d and %d\n",a,b);
	}	
	public static void main(String[] args) {
		construct s=new construct();
		
	}
}
