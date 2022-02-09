package project2;

public class staticimpl 
{
	private static int age; 
	private static String name;                              
	private static void disp()
	
	{ 
		System.out.println("Age is: "+age); 
		System.out.println("Name is: "+name);
	}
	public static void main(String[] args) {
		staticimpl.age=101;
		staticimpl.name="CSE";
		staticimpl.disp();

	} 
	
}
