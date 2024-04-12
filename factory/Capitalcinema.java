package factory;

public class Capitalcinema implements Ticket {

	@Override
	public void theatre() {
		System.out.println("trendset-captial cinema");
		
	}

	@Override
	public void seats() {
		System.out.println("242 seats per screen(total 6)");
		
	}

	@Override
	public void location() {
		System.out.println("benz circle");
		
	}

	@Override
	public void movies() {
		System.out.println("tillu2,family star");
		
	}

	@Override
	public void showtime() {
		System.out.println("11 am,1.45 pm,6 pm,7.30 pm");
		
	}

	@Override
	public void ticketcost() {
		System.out.println("approx 177");
		
	}

	@Override
	public void datebooking() {
		System.out.println("varies from weekdays and weekends");
		
	}

}
