
public class Bank {
	private static Bank b;
	private double balance;
	
	private Bank()
	{
		balance=10000;
	}
	public static Bank getInstance()
	{
		if(b==null)
		{
			b=new Bank();
		}
		return b;

	}
	public void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println(balance);
		
	}
	public void withdraw(double amt)
	{
		if(balance>=amt)
		{
		balance=balance-amt;
		System.out.println(balance);
		}
		else
		{
			System.out.println("balance chudu");
		}
	}
}
