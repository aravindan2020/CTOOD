package p2;
//local inner class
public class Outer1 {
	private int data=30;//instance variable  
	 void display(){  
	  class Local
	{  
	   void msg()
	{
	System.out.println(data);
	}  
	 }  
	  Local l=new Local();  
	  l.msg();  
}
}

