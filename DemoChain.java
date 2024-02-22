package P2;

public class DemoChain {

	public static void main(String[] args) {
		Chain freefire=new Chain();
		Chain bgmi=new Chain(freefire);
		bgmi.computerank(250,40.05f);
		bgmi.computerank(250, 40.05f,550);
		System.out.println(freefire);
		
		// TODO Auto-generated method stub

	}

}
