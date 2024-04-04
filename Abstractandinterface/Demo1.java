package Abstractandinterface;

public class Demo1 {

	public static void main(String[] args) {
		Bowler1 b =new Allrounder();
		b.blowingperformance("narine", 38, 200);
		Batsman1 b1=new Allrounder();
		b1.batsmanperformance("narine", 38, 5187);
		//System.out.println(b);
		//System.out.println(b1);
		Allrounder b2 =new Allrounder();
		b2.blowingperformance("narine", 38, 200);
		b2.batsmanperformance("narine", 38, 5187);
		System.out.println(b2);

	}

}
