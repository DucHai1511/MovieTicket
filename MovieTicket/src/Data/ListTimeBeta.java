package Data;

import java.util.ArrayList;
import java.util.List;

import Model.Ticket;
import Model.Time;

public class ListTimeBeta {
	public static List<Time> getListTimeBeta1() {
		Ticket tk_spiderMan_Beta = new Ticket("SpiderMan", ListSeats.getListSeatBeta());
		Ticket tk_avatar_Beta = new Ticket("Avatar", ListSeats.getListSeatBeta());
		
		Time time_spiderMan_Beta = new Time("15/3/2023", "16h00", tk_spiderMan_Beta);
		Time time_avatar_Beta = new Time("15/3/2023", "19h00", tk_avatar_Beta);
				
		List<Time> time_beta1 = new ArrayList<>();
		time_beta1.add(time_spiderMan_Beta);
		time_beta1.add(time_avatar_Beta);
		
		return time_beta1;
	}
	
	public static List<Time> getListTimeBeta2() {
		Ticket tk_babylon_Beta = new Ticket("Babylon", ListSeats.getListSeatBeta());
		Ticket tk_lionKing_Beta = new Ticket("LionKing", ListSeats.getListSeatBeta());
		
		Time time_babylon_Beta = new Time("15/3/2023", "21h00", tk_babylon_Beta);
		Time time_lionKing_Beta = new Time("15/3/2023", "10h00", tk_lionKing_Beta);
				
				
		List<Time> time_beta2 = new ArrayList<>();
		time_beta2.add(time_babylon_Beta);
		time_beta2.add(time_lionKing_Beta);
		
		return time_beta2;
	}
	
	public static List<Time> getListTimeBeta3() {
		Ticket tk_spiderMan_Beta = new Ticket("SpiderMan", ListSeats.getListSeatBeta());
		Ticket tk_babylon_Beta = new Ticket("Babylon", ListSeats.getListSeatBeta());
		
		Time time_spiderMan_Beta = new Time("15/3/2023", "16h00", tk_spiderMan_Beta);
		Time time_babylon_Beta = new Time("15/3/2023", "21h00", tk_babylon_Beta);
					
		List<Time> time_beta3 = new ArrayList<>();
		time_beta3.add(time_spiderMan_Beta);
		time_beta3.add(time_babylon_Beta);
		
		return time_beta3;
	}
}
