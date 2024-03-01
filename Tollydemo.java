
public class Tollydemo {

	public static void main(String[] args) {
		//public Producer(double money, String script, String actor, String actress)
		Tollywood p=new Producer(500,"Action","balayya","Sreeleela");
		//public Director(double money, String screendesign, String editor)
		Tollywood d=new Director(500,"Epic","chotta k naidu"); 
		//p.profit();
		p.display();
		// TODO Auto-generated method stub

	}

}
