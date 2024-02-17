package P1;

import java.util.Scanner;

public class Account {
	static long cn;
	static String name;
	static int pin;
	public static void AccountDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the card number");
		cn=s.nextLong();
		System.out.println("enter the pin number");
		pin=s.nextInt();
		System.out.println("enter the Name");
		name=s.next();
		System.out.println("name :"+name);
		System.out.println("cardnumber : "+cn);	}

	public static void main(String[] args) {	
		Account.AccountDetails();
	}
}
