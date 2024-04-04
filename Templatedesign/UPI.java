package Templatedesign;

public abstract class UPI {
	
	public abstract void pattern();
	
	public abstract void scanQR();
	
	public abstract void Mpin();
	
	public abstract void transferamt();
	
	public abstract void balance();
	
	public final void UPIprocess()
	{
		pattern();
		scanQR();
		Mpin();
		transferamt();
		balance();
	}
	
	
	
	
	

}
