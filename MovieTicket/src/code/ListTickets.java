package code;

public class ListTickets {
	public static Ticket getTicketSpidermanBeta() {
	
		Ticket tk_spiderMan_Beta = new Ticket("SpiderMan", ListSeats.getListSeatBeta());	
		
		return tk_spiderMan_Beta;
	}
	
	public static Ticket getTicketSpidermanLotte() {
		Ticket tk_spiderMan_Lotte = new Ticket("SpiderMan", ListSeats.getListSeatLotte());	
		
		return tk_spiderMan_Lotte;
	}
	
	public static Ticket getTicketSpidermanCgv() {
		Ticket tk_spiderMan_Cgv = new Ticket("SpiderMan", ListSeats.getListSeatCgv());	
		
		return tk_spiderMan_Cgv;
	}
}
