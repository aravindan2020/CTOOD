package socialmedia;

public class Whatsapp extends API {

	@Override
	public void chatting() {
		System.out.println("send the stickers");
		
	}

	@Override
	public void calls() {
		System.out.println("normal calls video,audio");
		
	}

	@Override
	public void profile() {
		System.out.println("username,bio,DP,status");
		
	}

	@Override
	public void login() {
		System.out.println("login with 3 to 4 device ,OTP,pin,pattern");
		
	}

	@Override
	public void followers() {
		System.out.println("visible only for celebrities account");		
	}

	@Override
	public void sharing() {
		// TODO Auto-generated method stub
		
	}
	

}
