package code;

import java.util.ArrayList;
import java.util.List;

public class ListRooms {
	public static List<Room> getlistRoomBeta() {
		Room beta1 = new Room("Beta1", ListTimeBeta.getListTimeBeta1());
		Room beta2 = new Room("Beta2", ListTimeBeta.getListTimeBeta2());
		Room beta3 = new Room("Beta3", ListTimeBeta.getListTimeBeta3());
		
		List<Room> listRoomBeta = new ArrayList<>();
		listRoomBeta.add(beta1);
		listRoomBeta.add(beta2);
		listRoomBeta.add(beta3);
		
		return listRoomBeta;
	}
	
	public static List<Room> getlistRoomLotte() {
		Room lotte1 = new Room("Lotte1", ListTimeLotte.getListTimeLotte1());
		Room lotte2 = new Room("Lotte2", ListTimeLotte.getListTimeLotte2());
		Room lotte3 = new Room("Lotte3", ListTimeLotte.getListTimeLotte3());
		
		List<Room> listRoomLotte = new ArrayList<>();
		listRoomLotte.add(lotte1);
		listRoomLotte.add(lotte2);
		listRoomLotte.add(lotte3);
		
		return listRoomLotte;
	}
	
	public static List<Room> getlistRoomCgv() {
		Room cgv1 = new Room("Cgv1", ListTimeCgv.getListTimeCgv1());
		Room cgv2 = new Room("Cgv2", ListTimeCgv.getListTimeCgv2());
		Room cgv3 = new Room("Cgv3", ListTimeCgv.getListTimeCgv3());
		
		List<Room> listRoomCgv = new ArrayList<>();
		listRoomCgv.add(cgv1);
		listRoomCgv.add(cgv2);
		listRoomCgv.add(cgv3);
		
		return listRoomCgv;
	}
	
}
