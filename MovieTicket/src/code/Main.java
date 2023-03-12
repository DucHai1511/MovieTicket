package code;

public class Main {
	public static void main(String[] args) {
		Cinema beta = new Cinema("Beta cinema", "My Dinh 2", ListRooms.getlistRoomBeta());
		Cinema lotte = new Cinema("Lotte Cinema", "Dao Tan", ListRooms.getlistRoomLotte());
		Cinema cgv = new Cinema("CGV cinema", "Nguyen Trai", ListRooms.getlistRoomCgv());
		
		System.out.println(beta);
		System.out.println(lotte);
		System.out.println(cgv);
	}
}
