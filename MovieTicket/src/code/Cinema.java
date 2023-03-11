package code;

import java.util.List;

public class Cinema {
	private String cinemaName;
	private String address;
	private List<Room> listRoom;
	
	public Cinema(String cinemaName, String address, List<Room> listRoom) {
		this.cinemaName = cinemaName;
		this.address = address;
		this.listRoom = listRoom;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Room> getListRoom() {
		return listRoom;
	}

	public void setListRoom(List<Room> listRoom) {
		this.listRoom = listRoom;
	}

	@Override
	public String toString() {
		return "Cinema [cinemaName: " + cinemaName + ", address: " + address + ", listRoom: " + listRoom + "]";
	}
	
	
}
