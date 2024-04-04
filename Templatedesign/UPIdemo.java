package Templatedesign;

import java.util.Scanner;

public class UPIdemo {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter 1 for phonepe or 2 for gpay");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			UPI p=new phonepe();
			p.UPIprocess();
			break;
		case 2:
			UPI g=new Gpay();
			g.UPIprocess();
			break;
		}
	}
}
