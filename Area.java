package P1;

import java.util.Scanner;

public class Area {
	static int l,b;//instance variable
	void Rectangle()
	{
		Scanner s =new Scanner(System.in);
		l=s.nextInt();
		b=s.nextInt();
		int a=l*b;
		System.out.println(a);
	}
	public static void perimeter()
	{
		int p=2*(l+b);
		System.out.println(p);
		
	}
	
	

	public static void main(String[] args) {
		Area ar=new Area();
		ar.Rectangle();
		Area.perimeter();
		
		

	}

}
