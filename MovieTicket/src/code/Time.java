package code;

public class Time {
	private String date;
	private String time;
	private Ticket ticket;
	
	public Time(String date, String time, Ticket ticket) {
		this.date = date;
		this.time = time;
		this.ticket = ticket;
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

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Time [date: " + date + ", time: " + time + ", ticket: " + ticket + "]";
	}
	
	
}
