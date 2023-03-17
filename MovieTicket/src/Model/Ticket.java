package Model;

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

	public List<List<Seat>> getListSeat() {
		return listSeat;
	}

	public void setListSeat(List<List<Seat>> listSeat) {
		this.listSeat = listSeat;
	}

	@Override
	public String toString() {
		return "Ticket [movieName: " + movieName + ", listSeat: " + listSeat + "]";
	}
	
	
}
