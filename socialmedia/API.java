package socialmedia;

public abstract class API {
	public abstract void chatting();
	
	public abstract void calls();
	
	public abstract void profile();
	
	public abstract void login();
	
	public abstract void followers();
	
	public abstract void sharing();
	
	public final void plugins()
	{
		login();
		profile();
		followers();
		chatting();
		calls();
		sharing();
		
	}
	

}
