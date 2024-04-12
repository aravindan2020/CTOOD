package Decorator;

public class Masaladosa implements Dosa  {
	private final Dosa d;

	
	public Masaladosa(Dosa d) {
		this.d = d;
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return d.getcost()+20.0;
	}

	@Override
	public String Description() {
		// TODO Auto-generated method stub
		return d.Description()+" ,mysore masala";
	}
}
