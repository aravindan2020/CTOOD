package Decorator;

public class pesarattu implements Dosa {
	private final Dosa d;
	

	public pesarattu(Dosa d) {
		this.d = d;
	}

	@Override
	public double getcost() {
		// TODO Auto-generated method stub
		return d.getcost()+10.0;
	}

	@Override
	public String Description() {
		// TODO Auto-generated method stub
		return d.Description()+", with whole green grams";
	}
	

}
