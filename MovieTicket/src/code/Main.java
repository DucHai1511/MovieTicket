package code;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static List<Cinema> listCinema = new ArrayList<>();
	public static void main(String[] args) {
		Cinema beta = new Cinema("Beta", "My Dinh 2", ListRooms.getlistRoomBeta());
		Cinema lotte = new Cinema("Lotte", "Dao Tan", ListRooms.getlistRoomLotte());
		Cinema cgv = new Cinema("CGV", "Nguyen Trai", ListRooms.getlistRoomCgv());
		listCinema.add(beta);
		listCinema.add(lotte);
		listCinema.add(cgv);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--------MENU--------");
			System.out.println("1. BAN VE CHO DAI LY");
			System.out.println("2. BAN VE TRUC TIEP");
			System.out.println("3. THOAT");
			System.out.print("--> Nhap lua chon cua ban: ");
			String choiceMenu = sc.nextLine();
			try {
				int numChoice = Integer.parseInt(choiceMenu);
				if(numChoice == 1) {
					menu1(sc);
				} else if (numChoice == 2) {
					menu2(sc);
				} else if (numChoice == 3) {
					System.out.println("--------XIN CHAO VA HEN GAP LAI !--------");
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Ban nhap khong dung. Vui long nhap lai!");
			}
		}
	}
	
	public static void menu1(Scanner sc) {
		while(true) {
			System.out.println("--------BAN VE CHO DAI LY--------");
			System.out.println("1. KIEM TRA XEM VE CON KHONG");
			System.out.println("2. DAT VE");
			System.out.println("3. THOAT");
			System.out.print("--> Nhap lua chon cua ban: ");
			String choiceMenu = sc.nextLine();
			try {
				int numChoice = Integer.parseInt(choiceMenu);
				if(numChoice == 1) {
					System.out.print("- Ten rap (Beta/Lotte/CGV) : ");
					String cinemaName = sc.nextLine();
					System.out.print("- Nhap ten phim: ");
					String movieName = sc.nextLine();
					System.out.print("- Nhap khung gio: ");
					String time = sc.nextLine();
					System.out.print("- Nhap phong: ");
					String room = sc.nextLine();
					System.out.print("- Nhap hang:");
					String row = sc.nextLine();
					System.out.print("- Nhap so: ");
					int num = sc.nextInt();
					sc.nextLine();
					if(checkTicket(listCinema, cinemaName, movieName, time, room, row, num)) {
						System.out.println("VE NAY HIEN VAN DANG CON !");
						break;
					} else {
						System.out.println("VE NAY HIEN DA HET HOAC KHONG TON TAI !");
						break;
					}
				} else if (numChoice == 2) {
					bookTicketByCinema(sc);
					break;
				} else if (numChoice == 3) {
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Ban nhap khong dung. Vui long nhap lai!");
			}
		}
	}
	
	public static void menu2(Scanner sc) {
		while(true) {
			System.out.println("--------BAN VE TRUC TIEP--------");
			System.out.println("1. TIM KIEM THEO TEN PHIM");
			System.out.println("2. TIM KIEM THEO RAP");
			System.out.println("3. TIM KIEM THEO DIA CHI");
			System.out.println("4. DAT VE ");
			System.out.println("5. THOAT");
			System.out.print("--> Nhap lua chon cua ban: ");
			String choiceMenu = sc.nextLine();
			try {
				int numChoice = Integer.parseInt(choiceMenu);
				if(numChoice == 1) {
					findByMovie(sc);
					menu2(sc);
				} else if (numChoice == 2) {
					findByCinema(sc);
					menu2(sc);
				} else if (numChoice == 3) {
					findByAddress(sc);
					menu2(sc);
				} else if (numChoice == 4) {
					menu3(sc);
				} else if (numChoice == 5) {
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Ban nhap khong dung. Vui long nhap lai!");
			}
		}
	}
	
	public static void menu3(Scanner sc) {
		while(true) {
			System.out.println("--------DAT VE--------");
			System.out.println("1. DAT 1 VE");
			System.out.println("2. DAT NHIEU VE KHAC NHAU");
			System.out.println("3. DAT NHIEU VE LIEN TIEP NHAU");
			System.out.println("3. THOAT");
			System.out.print("--> Nhap lua chon cua ban: ");
			String choiceMenu = sc.nextLine();
			try {
				int numChoice = Integer.parseInt(choiceMenu);
				if(numChoice == 1) {
					bookTicketByCinema(sc);
					menu2(sc);
				} else if (numChoice == 2) {
					System.out.println("- Ban muon dat bao nhieu ve ?");
					int times = sc.nextInt();
					sc.nextLine();
					int check = 0;
					for(int i = 0; i < times; i++) {
						System.out.println("VE " + (i+1));
						if(bookTicketByCinema(sc)) {
							check++;
						}
					}
					if(check == times) {
						System.out.println("BAN DA DAT " + times + " VE THANH CONG !");
					} else {
						System.out.println("BAN CHI DAT DUOC " + check + " VE !");
					}
					menu2(sc);
				} else if (numChoice == 3) {
					findByAddress(sc);
					menu2(sc);
				} else if (numChoice == 4) {
					
				} else if (numChoice == 5) {
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Ban nhap khong dung. Vui long nhap lai!");
			}
		}
	}
	
	public static String showListMovie(List<Cinema> listCinema, String cinemaName) {
		List<String> listString = new ArrayList<>();
		for(Cinema cinema : listCinema) {
			if(cinema.getCinemaName().equals(cinemaName)) {
				for(Room room : cinema.getListRoom()) {
					for(Time time : room.getListTime()) {
						if(!listString.contains(time.getTicket().getMovieName())) {
							listString.add(time.getTicket().getMovieName());
						}
					}
				}
			}
		}
		String str = "";
		for(String s : listString) {
			str += s + "\n";
		}
		return str;
	}
	
	public static String showListMovieTime(List<Cinema> listCinema, String cinemaName, String movieName) {
		String str = "";
		for(Cinema cinema : listCinema) {
			if(cinema.getCinemaName().equals(cinemaName)) {
				for(Room room : cinema.getListRoom()) {
					for(Time time : room.getListTime()) {
						if(time.getTicket().getMovieName().equals(movieName)) {
							str += room.getRoomName() + " - " + time.getDate() + " - " + time.getTime() + "\n";
						}
					}
				}
			}
		}
		return str;
	}
	
	public static void showListSeat(List<Cinema> listCinema, String cinemaName, String movieName, String tim, String roomName) {
		for(Cinema cinema : listCinema) {
			if(cinema.getCinemaName().equals(cinemaName)) {
				for(Room room : cinema.getListRoom()) {
					for(Time time : room.getListTime()) {
						if(time.getTicket().getMovieName().equals(movieName) && time.getTime().equals(tim) && room.getRoomName().equals(roomName)) {
							for(List<Seat> listSeat : time.getTicket().getListSeat()) {
								System.out.println(listSeat);
							}
						}
					}
				}
			}
		}
	}
	
	public static void removeTicket(List<Cinema> listCinema, String cinemaName, String movieName, String tim, String roomName, String row, int number) {
		for(int i = 0; i < listCinema.size(); i++) {
			if(listCinema.get(i).getCinemaName().equals(cinemaName)) {
				for(int j = 0; j < listCinema.get(i).getListRoom().size(); j++) {
					if(listCinema.get(i).getListRoom().get(j).getRoomName().equals(roomName)) {
						for(int k = 0; k < listCinema.get(i).getListRoom().get(j).getListTime().size(); k++) {
							if(listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTime().equals(tim)
									&& listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getMovieName().equals(movieName)) {
								for(int p = 0; p < listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().size(); p++) {
									for(int q = 0; q < listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).size(); q++) {
										if(listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).get(q).getRow().equals(row)
										&& listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).get(q).getNumber() == number) {
											listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).remove(q);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static boolean checkTicket(List<Cinema> listCinema, String cinemaName, String movieName, String tim, String roomName, String row, int number) {
		for(int i = 0; i < listCinema.size(); i++) {
			if(listCinema.get(i).getCinemaName().equals(cinemaName)) {
				for(int j = 0; j < listCinema.get(i).getListRoom().size(); j++) {
					if(listCinema.get(i).getListRoom().get(j).getRoomName().equals(roomName)) {
						for(int k = 0; k < listCinema.get(i).getListRoom().get(j).getListTime().size(); k++) {
							if(listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTime().equals(tim)
									&& listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getMovieName().equals(movieName)) {
								for(int p = 0; p < listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().size(); p++) {
									for(int q = 0; q < listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).size(); q++) {
										if(listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).get(q).getRow().equals(row)
										&& listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getListSeat().get(p).get(q).getNumber() == number) {
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public static boolean bookTicketByCinema(Scanner sc) {
		System.out.print("- Ten rap (Beta/Lotte/CGV) : ");
		String cinemaName = sc.nextLine();
		System.out.println("Cac phim hien co: ");
		System.out.print(showListMovie(listCinema, cinemaName));
		System.out.print("- Nhap ten phim: ");
		String movieName = sc.nextLine();
		System.out.println("Cac khung gio chieu: ");
		System.out.print(showListMovieTime(listCinema, cinemaName, movieName));
		System.out.print("- Nhap khung gio: ");
		String time = sc.nextLine();
		System.out.print("- Nhap phong: ");
		String room = sc.nextLine();
		System.out.println("Danh sach ghe con trong:" );
		showListSeat(listCinema, cinemaName, movieName, time, room);
		System.out.print("- Nhap hang: ");
		String row = sc.nextLine();
		System.out.print("- Nhap so: ");
		int number = sc.nextInt();
		sc.nextLine();
		if (checkTicket(listCinema, cinemaName, movieName, time, room, row, number)) {
			removeTicket(listCinema, cinemaName, movieName, time, room, row, number);
			System.out.println("DAT VE THANH CONG !");
			return true;
		} else {
			System.out.println("VE NAY HIEN DA HET HOAC KHONG TON TAI !");
			System.out.println("BAN CO MUON DAT VE KHAC KHONG (Y/N) ?");
			String bookChoice = sc.nextLine();
			if(bookChoice.equals("Y")) {
				bookTicketByCinema(sc);
			} else {
				return false;
			}
		}
		return false;
	}
	
	public static String showByMovie(List<Cinema> listCinema, String movieName) {
		String str = "";
		for(int i = 0; i < listCinema.size(); i++) {
			for(int j = 0; j < listCinema.get(i).getListRoom().size(); j++) {
				for(int k = 0; k < listCinema.get(i).getListRoom().get(j).getListTime().size(); k++) {
					if(listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getMovieName().equals(movieName)) {
						str += listCinema.get(i).getCinemaName() + " - " + listCinema.get(i).getAddress() + 
								" - " + listCinema.get(i).getListRoom().get(j).getRoomName() + 
								" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getDate() +
								" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTime() + "\n";
					}
				}
			}
		}
		return str;
	}
	
	public static String showByCinema(List<Cinema> listCinema, String cinemaName) {
		String str = "";
		for(int i = 0; i < listCinema.size(); i++) {
			if(listCinema.get(i).getCinemaName().equals(cinemaName)) {
				for(int j = 0; j < listCinema.get(i).getListRoom().size(); j++) {
					for(int k = 0; k < listCinema.get(i).getListRoom().get(j).getListTime().size(); k++) {
							str += listCinema.get(i).getAddress() + 
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getMovieName() + 
									" - " + listCinema.get(i).getListRoom().get(j).getRoomName() + 
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getDate() +
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTime() + "\n";
						}
					}
				}
			}
		return str;
	}
	
	public static String showByAddress(List<Cinema> listCinema, String address) {
		String str = "";
		for(int i = 0; i < listCinema.size(); i++) {
			if(listCinema.get(i).getAddress().equals(address)) {
				for(int j = 0; j < listCinema.get(i).getListRoom().size(); j++) {
					for(int k = 0; k < listCinema.get(i).getListRoom().get(j).getListTime().size(); k++) {
							str += listCinema.get(i).getCinemaName() + 
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTicket().getMovieName() + 
									" - " + listCinema.get(i).getListRoom().get(j).getRoomName() + 
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getDate() +
									" - " + listCinema.get(i).getListRoom().get(j).getListTime().get(k).getTime() + "\n";
						}
					}
				}
			}
		return str;
	}
	
	public static void findByMovie(Scanner sc) {
		System.out.print("- Ten phim: ");
		String movieName = sc.nextLine();
		System.out.println("Cac rap hien chieu: ");
		System.out.print(showByMovie(listCinema, movieName));
	}
	
	public static void findByCinema(Scanner sc) {
		System.out.print("- Ten rap: ");
		String cinemaName = sc.nextLine();
		System.out.println("Cac phim hien chieu: ");
		System.out.print(showByCinema(listCinema, cinemaName));
	}
	
	public static void findByAddress(Scanner sc) {
		System.out.print("- Dia Chi: ");
		String address = sc.nextLine();
		System.out.println("Cac rap hien chieu: ");
		System.out.print(showByAddress(listCinema, address));
	}
	
}
