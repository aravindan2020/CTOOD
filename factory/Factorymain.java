package factory;

import java.util.Scanner;

public class Factorymain {

	public static void main(String[] args) {
		Amazonfactory am=new Amazonfactory();
		Scanner S=new Scanner(System.in);
		String s1=S.next();
		mobile m=am.getInstance(s1);
		m.specs();

	}

}
