package aggregation1;

public class Mobilenumber {
	private long airtelno;
	private long jiono;
	public Mobilenumber(long airtelno, long jiono) {
		this.airtelno = airtelno;
		this.jiono = jiono;
	}
	@Override
	public String toString() {
		return "Mobilenumber [airtelno=" + airtelno + ", jiono=" + jiono + "]";
	}
	boolean electionid()
	{
		System.out.println("this displays the electionid");
		return true;
	}
}
