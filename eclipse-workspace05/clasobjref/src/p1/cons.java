package p1;

public class cons {
	String z;
	cons(String z)
	{
		this.z=z;
	}
	cons(cons c1)
	{
		z=c1.z;
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		
		cons c3=new cons("CSE");
		cons mobile =new cons(c3);
		cons laptop=new cons(c3);
		cons ipad=new cons(c3);
	}

}
