package p2;

class getset {
	private int l, b, h;

	void setLength(int l) //setters
	{
		this.l = l;
	}
	String getLength() //getters
	{
		return l + "M";
	}
	void setBreadth(int b) {
		this.b = b;
	}
	String getBreadth() {
		return b + "M";
	}
	void setHeight(int h) {
		this.h = h;
	}
	String getHeight()
	{
		return h + "M";
	}
	String FindVolume() {
		return l * b * h + "Cu.M";
	}
	public String toString() {
		String b = String.format("Length=%s\n,Breath=%s\n,Height=%s\n,the total is %s", getLength(), getBreadth(),
				getHeight(), FindVolume());
		return b;
	}
}
