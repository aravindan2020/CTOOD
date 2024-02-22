package P2;

public class Chain {
	String cahrname,Avatar,rank;
	int level;
	float ingamecurrency;
	public Chain(String cahrname, String avatar, String rank, int level, float ingamecurrency) {
		this.cahrname = cahrname;
		this.Avatar = avatar;
		this.rank = rank;
		this.level = level;
		this.ingamecurrency = ingamecurrency;
	}
	public Chain() {
		this("Aravindan","hulk","ace",106,1000.0f);	
		System.out.println("this is default constructor");
	}
	public Chain(Chain pubg ) 
	{
		this.cahrname = pubg.cahrname;
		this.Avatar = pubg.Avatar;
		this.rank = pubg.rank;
		this.level = pubg.level;
		this.ingamecurrency = pubg.ingamecurrency;
	}
	void computerank(int kills,float time)
	{
		if((kills>200)&&(time<30))
		{
			System.out.println("gold");
		}
		
	}
	//method overloading
	void computerank(int kills,float time,int damage)
	{
		if((kills>200)&&(time<30)&&(damage>500))
		{
			System.out.println("gold");
		}
	}
	
	@Override
	public String toString() {
		return "Chain [cahrname=" + cahrname + ", Avatar=" + Avatar + ", rank=" + rank + ", level=" + level
				+ ", ingamecurrency=" + ingamecurrency + "]";
	}
	
	
	
	
	
	
	

}
