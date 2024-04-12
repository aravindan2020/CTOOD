package factory;

import java.util.Scanner;

public class Ticketmain {

	public static void main(String[] args) {
		Bookmyshow b=new Bookmyshow();
		Scanner S=new Scanner(System.in);
		String s1=S.next();
		Ticket t=b.getInstance(s1);
		t.location();
		t.theatre();
		t.seats();
		t.movies();
		t.datebooking();
		t.showtime();
		t.ticketcost();

	}

}
