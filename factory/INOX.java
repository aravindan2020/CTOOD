package factory;

public class INOX implements Ticket {

	@Override
	public void theatre() {
		System.out.println("LEPL-INOX");
		
	}

	@Override
	public void seats() {
		System.out.println("seats available:200");
		
	}

	@Override
	public void location() {
		System.out.println("patamatta");
		
	}

	@Override
	public void movies() {
		System.out.println("tillu2,family star");
		
	}

	@Override
	public void showtime() {
		System.out.println("4 shows-9 am,11.30am,2.30pm,6pm");
		
	}

	@Override
	public void ticketcost() {
		System.out.println("169 to 275");
		
	}

	@Override
	public void datebooking() {
		System.out.println("varies from weekdays and weekends");
		
	}
	

}
