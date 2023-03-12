package code;

import java.util.List;

public class Ticket {
	private String movieName;
	private List<List<Seat>> listSeat;
	
	public Ticket(String movieName, List<List<Seat>> listSeat) {
		this.movieName = movieName;
		this.listSeat = listSeat;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

//	public Seat getSeat() {
//		return seat;
//	}
//
//	public void setListSeat(Seat seat) {
//		this.seat = seat;
//	}

	@Override
	public String toString() {
		return "Ticket [movieName: " + movieName + ", seat: " + listSeat + "]";
	}
	
	
}
