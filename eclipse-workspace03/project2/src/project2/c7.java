package project2;

public class c7 {

	
		private static  int c,l=9;
		private static  int b=8;
		private static void Calc()
		{
	     System.out.println("this is the static block ");
		}
	public static void main(String[] args) {
		
		c=l*b;
		System.out.println(c);
		Calc();
		System.out.println(b);
		System.out.println(l);
		
	}

}
