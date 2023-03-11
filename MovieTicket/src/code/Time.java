package code;

import java.util.List;

public class Time {
	private String date;
	private String time;
	private List<Ticket> listTicket;
	
	public Time(String date, String time, List<Ticket> listTicket) {
		this.date = date;
		this.time = time;
		this.listTicket = listTicket;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<Ticket> getListTicket() {
		return listTicket;
	}

	public void setListTicket(List<Ticket> listTicket) {
		this.listTicket = listTicket;
	}

	@Override
	public String toString() {
		return "Time [date: " + date + ", time: " + time + ", listTicket: " + listTicket + "]";
	}
	
	
}
