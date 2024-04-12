package factory;

public class Amazonfactory {
	
	public mobile getInstance(String str)
	{
		if(str.equals("samsung"))
		{
			return new Samsung();
		}
		else if(str.equals("iphone"))
		{
			return new Iphone();
		}
		else
		{
		return new Motorola();
		}
	}

}
