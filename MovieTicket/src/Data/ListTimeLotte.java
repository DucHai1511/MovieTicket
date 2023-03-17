package Data;

import java.util.ArrayList;
import java.util.List;

import Model.Ticket;
import Model.Time;

public class ListTimeLotte {
	public static List<Time> getListTimeLotte1() {
		Ticket tk_spiderMan_Lotte = new Ticket("SpiderMan", ListSeats.getListSeatLotte());
		Ticket tk_lionKing_Lotte = new Ticket("LionKing", ListSeats.getListSeatLotte());
		
		Time time_spiderMan_Lotte = new Time("16/3/2023", "17h00", tk_spiderMan_Lotte);
		Time time_lionKing_Lotte = new Time("16/3/2023", "23h00", tk_lionKing_Lotte);
				
				
		List<Time> time_lotte1 = new ArrayList<>();
		time_lotte1.add(time_spiderMan_Lotte);
		time_lotte1.add(time_lionKing_Lotte);
		
		return time_lotte1;
	}
	
	public static List<Time> getListTimeLotte2() {
		Ticket tk_avatar_Lotte = new Ticket("Avatar", ListSeats.getListSeatLotte());
		Ticket tk_babylon_Lotte = new Ticket("Babylon", ListSeats.getListSeatLotte());

		Time time_avatar_Lotte = new Time("16/3/2023", "20h00", tk_avatar_Lotte);
		Time time_babylon_Lotte = new Time("16/3/2023", "22h00", tk_babylon_Lotte);
				
		List<Time> time_lotte2 = new ArrayList<>();
		time_lotte2.add(time_avatar_Lotte);
		time_lotte2.add(time_babylon_Lotte);
		
		return time_lotte2;
	}
	
	public static List<Time> getListTimeLotte3() {
		Ticket tk_spiderMan_Lotte = new Ticket("SpiderMan", ListSeats.getListSeatLotte());
		Ticket tk_babylon_Lotte = new Ticket("Babylon", ListSeats.getListSeatLotte());
		
		Time time_spiderMan_Lotte = new Time("16/3/2023", "17h00", tk_spiderMan_Lotte);
		Time time_babylon_Lotte = new Time("16/3/2023", "22h00", tk_babylon_Lotte);
				
		List<Time> time_lotte3 = new ArrayList<>();
		time_lotte3.add(time_spiderMan_Lotte);
		time_lotte3.add(time_babylon_Lotte);
		
		return time_lotte3;
	}
}
