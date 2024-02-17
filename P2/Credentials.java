package P2;

public class Credentials {
	String us,ps;

	public Credentials() {
		System.out.println("ఇది ఆధారాల కార్యక్రమం");
	}

	public Credentials(String us, String ps) {
		this.us = us;
		this.ps = ps;
	}

	public Credentials(Credentials cr) {
		this.us=cr.us;
		this.ps=cr.ps;	
	}

	@Override
	public String toString() {
		return "Credentials [us=" + us + ", ps=" + ps + "]";
	}
	
	
	
	

}
