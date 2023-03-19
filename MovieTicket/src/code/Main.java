package code;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Data.ListRooms;
import Model.Cinema;
import Model.Room;
import Model.Seat;
import Model.Time;

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
				} else {
					System.out.println("LUA CHON CUA BAN KHONG CO TRONG MENU. VUI LONG NHAP LAI !");
				}
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
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
					String roomName = sc.nextLine();
					System.out.print("- Nhap hang: ");
					String row = sc.nextLine();
					int num;
					while(true) {
						System.out.print("- Nhap so: ");
						String numString = sc.nextLine();
						try {
							num = Integer.parseInt(numString);
							if(num < 1 || num > 8) {
								throw new Exception();
							}
							break;
						} catch(NumberFormatException e) {
							System.out.println("BAN PHAI NHAP SO !");
						} catch(Exception e) {
							System.out.println("SO BAN NHAP PHAI TU 1-8 !");
						}
					}
					if(checkTicket(cinemaName, movieName, time, roomName, row, num)) {
						System.out.println("VE NAY HIEN VAN DANG CON !");
						menu1(sc);
					} else {
						System.out.println("VE NAY HIEN DA HET HOAC KHONG TON TAI !");
						menu1(sc);
					}
				} else if (numChoice == 2) {
					bookTicketByCinema(sc);
					menu1(sc);
				} else if (numChoice == 3) {
					break;
				} else {
					System.out.println("LUA CHON CUA BAN KHONG CO TRONG MENU. VUI LONG NHAP LAI !");
				}
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
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
					menu2(sc);
				} else if (numChoice == 5) {
					break;
				} else {
					System.out.println("LUA CHON CUA BAN KHONG CO TRONG MENU. VUI LONG NHAP LAI !");
				}
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
			}
		}
	}
	
	public static void menu3(Scanner sc) {
		while(true) {
			System.out.println("--------DAT VE--------");
			System.out.println("1. DAT 1 VE");
			System.out.println("2. DAT NHIEU VE KHAC NHAU");
			System.out.println("3. DAT NHIEU VE LIEN TIEP NHAU");
			System.out.println("4. THOAT");
			System.out.print("--> Nhap lua chon cua ban: ");
			String choiceMenu = sc.nextLine();
			try {
				int numChoice = Integer.parseInt(choiceMenu);
				if(numChoice == 1) {
					bookTicketByCinema(sc);
					menu3(sc);
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
					menu3(sc);
				} else if (numChoice == 3) {
					bookTicketsContinues(sc);
					menu3(sc);
				} else if (numChoice == 4) {
					break;
				} else {
					System.out.println("LUA CHON CUA BAN KHONG CO TRONG MENU. VUI LONG NHAP LAI !");
				}
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
			}
		}
	}
	
	public static String showListMovie(String cinemaName) {
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
	
	public static String showListMovieTime(String cinemaName, String movieName) {
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
	
	public static void showListSeat(String cinemaName, String movieName, String tim, String roomName) {
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
	
	public static void removeTicket(String cinemaName, String movieName, String tim, String roomName, String row, int number) {
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
	
	public static boolean checkTicket(String cinemaName, String movieName, String tim, String roomName, String row, int number) {
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
		System.out.print(showListMovie(cinemaName));
		System.out.print("- Nhap ten phim: ");
		String movieName = sc.nextLine();
		System.out.println("Cac khung gio chieu: ");
		System.out.print(showListMovieTime(cinemaName, movieName));
		System.out.print("- Nhap khung gio: ");
		String time = sc.nextLine();
		System.out.print("- Nhap phong: ");
		String roomName = sc.nextLine();
		System.out.println("Danh sach ghe con trong:" );
		showListSeat(cinemaName, movieName, time, roomName);
		System.out.print("- Nhap hang: ");
		String row = sc.nextLine();
		int num;
		while(true) {
			System.out.print("- Nhap so: ");
			String numString = sc.nextLine();
			try {
				num = Integer.parseInt(numString);
				if(num < 1 || num > 8) {
					throw new Exception();
				}
				break;
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
			} catch(Exception e) {
				System.out.println("SO BAN NHAP PHAI TU 1-8 !");
			}
		}
		if (checkTicket(cinemaName, movieName, time, roomName, row, num)) {
			removeTicket(cinemaName, movieName, time, roomName, row, num);
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
	
	public static String showByMovie(String movieName) {
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
	
	public static String showByCinema(String cinemaName) {
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
	
	public static String showByAddress(String address) {
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
		System.out.print(showByMovie(movieName));
	}
	
	public static void findByCinema(Scanner sc) {
		System.out.print("- Ten rap: ");
		String cinemaName = sc.nextLine();
		System.out.println("Cac phim hien chieu: ");
		System.out.print(showByCinema(cinemaName));
	}
	
	public static void findByAddress(Scanner sc) {
		System.out.print("- Dia Chi: ");
		String address = sc.nextLine();
		System.out.println("Cac rap hien chieu: ");
		System.out.print(showByAddress(address));
	}
	
	public static void bookTicketsContinues(Scanner sc) {
		System.out.print("- Ten rap (Beta/Lotte/CGV) : ");
		String cinemaName = sc.nextLine();
		System.out.println("Cac phim hien co: ");
		System.out.print(showListMovie(cinemaName));
		System.out.print("- Nhap ten phim: ");
		String movieName = sc.nextLine();
		System.out.println("Cac khung gio chieu: ");
		System.out.print(showListMovieTime(cinemaName, movieName));
		System.out.print("- Nhap khung gio: ");
		String time = sc.nextLine();
		System.out.print("- Nhap phong: ");
		String roomName = sc.nextLine();
		System.out.println("- Ban muon dat bao nhieu ghe lien tiep ?");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Cac hang ghe co " + number + " ghe lien tiep:");
		showSeatsContinues(cinemaName, movieName, time, roomName, number);
		System.out.println("- Chon Hang ghe ban muon dat ?");
		String row = sc.nextLine();
		System.out.println("- Ban muon dat tu ghe so may ?");
		int numSeat;
		while(true) {
			System.out.print("- Nhap so: ");
			String numString = sc.nextLine();
			try {
				numSeat = Integer.parseInt(numString);
				if(numSeat < 1 || numSeat > 8) {
					throw new Exception();
				}
				break;
			} catch(NumberFormatException e) {
				System.out.println("BAN PHAI NHAP SO !");
			} catch(Exception e) {
				System.out.println("SO BAN NHAP PHAI TU 1-8 !");
			}
		}
		bookSeatsContinues(cinemaName, movieName, time, roomName, number, row, numSeat);
		
	}
	
	public static void showSeatsContinues(String cinemaName, String movieName, String tim, String roomName, int number) {
		for(Cinema cinema : listCinema) {
			if(cinema.getCinemaName().equals(cinemaName)) {
				for(Room room : cinema.getListRoom()) {
					if(room.getRoomName().equals(roomName)) {
						for(Time time : room.getListTime()) {
							if(time.getTime().equals(tim) && time.getTicket().getMovieName().equals(movieName)) {
								for(int i = 0; i < time.getTicket().getListSeat().size(); i++) {
									int cnt = 1;
									for(int j = 0; j < time.getTicket().getListSeat().get(i).size() - 1; j++) {
										if(time.getTicket().getListSeat().get(i).get(j+1).getNumber() - time.getTicket().getListSeat().get(i).get(j).getNumber() == 1) {
											cnt++;
											if(cnt == number) {
												System.out.println(time.getTicket().getListSeat().get(i));
												break;
											}
										} else {
											cnt = 1;
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
	
	public static void bookSeatsContinues(String cinemaName, String movieName, String tim, String roomName, int number, String row, int numSeat) {
		for(Cinema cinema : listCinema) {
			if(cinema.getCinemaName().equals(cinemaName)) {
				for(Room room : cinema.getListRoom()) {
					if(room.getRoomName().equals(roomName)) {
						for(Time time : room.getListTime()) {
							if(time.getTime().equals(tim) && time.getTicket().getMovieName().equals(movieName)) {
								for(int i = 0; i < time.getTicket().getListSeat().size(); i++) {
									for(int j = 0; j < time.getTicket().getListSeat().get(i).size() - 1; j++) {
										if(time.getTicket().getListSeat().get(i).get(j).getRow().equals(row)
												&& time.getTicket().getListSeat().get(i).get(j).getNumber() == numSeat) {
											int cnt = 0;
											for(int k = 0; k < number; k++) {
												if(checkTicket(cinemaName, movieName, tim, roomName, row, numSeat+k)) {
													cnt++;
												}
											}
											if(cnt == number) {
												for(int k = 0; k < number; k++) {
													removeTicket(cinemaName, movieName, tim, roomName, row, numSeat+k);
													System.out.println("BAN DA DAT THANH CONG GHE " + row + (numSeat+k) + " THANH CONG !");
												}
											} else {
												System.out.println("BAN DAT VE KHONG THANH CONG !");
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
	}
}