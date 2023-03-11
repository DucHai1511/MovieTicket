package code;

import java.util.List;

public class Room {
	private String roomName;
	private List<Time> listTime;
	
	public Room(String roomName, List<Time> listTime) {
		this.roomName = roomName;
		this.listTime = listTime;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public List<Time> getListTime() {
		return listTime;
	}

	public void setListTime(List<Time> listTime) {
		this.listTime = listTime;
	}

	@Override
	public String toString() {
		return "Room [roomName: " + roomName + ", listTime: " + listTime + "]";
	}
	
	
}
