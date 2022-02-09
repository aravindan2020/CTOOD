package p1;
import java.util.Scanner;

public class Input {
	void oprn()
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		//scanner is class
		// in is a object reference
		// new is used to create new memory in my heap
		//scanner is constructor 
		//system.in is used to get the value from the keyboard
		System.out.println("enter the value of a");
		a=in.nextInt();
		//this is used to get the integer input
		// next is a common keyword followed by datatype
		System.out.println("enter the value of b");
		b=in.nextInt();
		int c =a+b;
		System.out.printf("the value of c is %d",c);
		System.out.println("the value of c is"+c);
		System.out.print("the value of c is"+c);
		in.close();
		
	}
	
}
