package constructor1;

public class getset {
	private int l,b,h;
	
	getset(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	/*
	 * void setLength(int l) { this.l=l;
	 * 
	 * } String getLength() { return l+"M"; } void setBreadth(int b) { this.b=b;
	 * 
	 * } String getBreadth() { return b+"M"; } void setHeight(int h) { this.h=h;
	 * 
	 * }
	 */
	/*
	 * String getHeight() { return h+"M"; }
	 */
	String FindVolume()
	{
		return l*b*h +"Cu.M";
	}
	public String toString()
	{
		String str=String.format("l=%d\nb=%d\nh=%d\nthe total is %s",l,b,h,FindVolume());
		return str;
	}
}
