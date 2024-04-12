package factory;

public class Bookmyshow {
	
	public Ticket getInstance(String str)
	{
		if(str.equals("familystar"))
		{
			return new Capitalcinema();
		}
		else if(str.equals("godzillaxkingkong"))
		{
			return new INOX();
		}
		else
		{
		return new cinepolis();
		}
	}

}
