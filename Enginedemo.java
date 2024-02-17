import java.util.Scanner;

public class Enginedemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id1=s.nextInt();
		String t1=s.next();
		int hp1=s.nextInt();
		float w1=s.nextFloat();
		Engine e=new Engine(hp1,id1,t1,w1);
		e.setHp(hp1);
		e.setId(id1);
		e.setType(t1);
		e.setW(w1);
		System.out.println(e);
		// TODO Auto-generated method stub

	}

}
