package code;

import java.util.ArrayList;
import java.util.List;

public class ListTimeCgv {
	public static List<Time> getListTimeCgv1() {
		Ticket tk_spiderMan_Cgv = new Ticket("SpiderMan", ListSeats.getListSeatCgv());
		Ticket tk_avatar_Cgv = new Ticket("Avatar", ListSeats.getListSeatCgv());
		
		Time time_spiderMan_Cgv = new Time("17/3/2023", "17h00", tk_spiderMan_Cgv);
		Time time_avatar_Cgv = new Time("17/3/2023", "21h00", tk_avatar_Cgv);
				
		List<Time> time_cgv1 = new ArrayList<>();
		time_cgv1.add(time_spiderMan_Cgv);
		time_cgv1.add(time_avatar_Cgv);
		
		return time_cgv1;
	}
	
	public static List<Time> getListTimeCgv2() {
		Ticket tk_babylon_Cgv = new Ticket("Babylon", ListSeats.getListSeatCgv());
		Ticket tk_lionKing_Cgv = new Ticket("LionKing", ListSeats.getListSeatCgv());
		
		Time time_babylon_Cgv = new Time("17/3/2023", "14h00", tk_babylon_Cgv);
		Time time_lionKing_Cgv = new Time("17/3/2023", "22h00", tk_lionKing_Cgv);
				
				
		List<Time> time_cgv2 = new ArrayList<>();
		time_cgv2.add(time_babylon_Cgv);
		time_cgv2.add(time_lionKing_Cgv);
		
		return time_cgv2;
	}
	
	public static List<Time> getListTimeCgv3() {
		Ticket tk_spiderMan_Cgv = new Ticket("SpiderMan", ListSeats.getListSeatCgv());
		Ticket tk_babylon_Cgv = new Ticket("Babylon", ListSeats.getListSeatCgv());
		
		Time time_spiderMan_Cgv = new Time("17/3/2023", "18h00", tk_spiderMan_Cgv);
		Time time_babylon_Cgv = new Time("17/3/2023", "23h00", tk_babylon_Cgv);
					
		List<Time> time_cgv3 = new ArrayList<>();
		time_cgv3.add(time_spiderMan_Cgv);
		time_cgv3.add(time_babylon_Cgv);
		
		return time_cgv3;
	}
}