
public class IPL {//super class
	float points,nrr;
	String oc,pc;
	public IPL(float points, float nrr, String oc, String pc) {
		this.points = points;
		this.nrr = nrr;
		this.oc = oc;
		this.pc = pc;
	}
	void thridumpire()
	{
		System.out.println("represented IPL board");
	}
	void display()
	{
		System.out.println("policy");
	}
	
	@Override
	public String toString() {
		return "IPL [points=" + points + ", nrr=" + nrr + ", oc=" + oc + ", pc=" + pc + "]";
	}
	
	
	

}
