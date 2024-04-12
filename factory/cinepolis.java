package factory;

public class cinepolis implements Ticket {

	@Override
	public void theatre() {
		System.out.println("PVP-cinepolis");
		
	}

	@Override
	public void seats() {
		System.out.println("6 screen-250 seats per screen");
		
	}

	@Override
	public void location() {
		System.out.println("mg road");
		
	}

	@Override
	public void movies() {
		System.out.println("godzilla X kingkong,family star");
		
	}

	@Override
	public void showtime() {
		System.out.println("11 am,1.45 pm,6 pm,7.30 pm");
		
	}

	@Override
	public void ticketcost() {
		System.out.println("approx 170");
		
	}

	@Override
	public void datebooking() {
		System.out.println("varies from weekdays and weekends");
		
	}
	

}
