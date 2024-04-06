package socialmedia;

import java.util.Scanner;

public class Mobile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		switch(s1)
		{
		case "instagram":
			API ins=new Instagram();
			ins.plugins();
			break;
		case "whatsapp":
			API whats=new Whatsapp();
		    whats.plugins();
			break;	
		}
		
	}

}
