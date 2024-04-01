package Arithmetic1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alpha {

	public static void main(String[] args) {
		String visaRegex = "^(?:[0-9\\s-]*{12}(?:[0-9\\s-]*{3})?)$"; 
		Pattern pattern = Pattern.compile(visaRegex);
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		s.nextLine();
	    Matcher matcher = pattern.matcher(s1);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
		// TODO Auto-generated method stub

	}

}
