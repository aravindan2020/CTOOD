
public class Director extends Tollywood {
	String screendesign,editor;

	public Director(double money, String screendesign, String editor) {
		super(money);
		this.screendesign = screendesign;
		this.editor = editor;
	}
	void profit()
	{
		System.out.println("public reviews");
	}
void display()
{
	super.profit();
	profit();
}
	@Override
	public String toString() {
		return "Director [screendesign=" + screendesign + ", editor=" + editor + "]";
	}
	
	

}
