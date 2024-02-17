package P2;

import java.util.Scanner;

public class Creddemo {

	public static void main(String[] args) {
		Credentials cr1=new Credentials();
		Scanner s=new Scanner(System.in);
		String us1=s.next();
		String ps1=s.next();		
		Credentials cr2=new Credentials(us1,ps1);
		Credentials cr3=new Credentials(cr2);
		System.out.println(cr1);
		// TODO Auto-generated method stub

	}

}
