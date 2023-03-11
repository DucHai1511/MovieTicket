package code;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<List<Seat>> listSeat = getListSeat();
		
		for(int i = 0; i < listSeat.size(); i++) {
			for(int j = 0; j < listSeat.get(i).size(); j++) {
				if(listSeat.get(i).get(j).getRow().equals("G") && listSeat.get(i).get(j).getNumber()==3) {
					listSeat.get(i).remove(listSeat.get(i).get(j));
				}
			}
		}
		
		for(List<Seat> list: listSeat) {
			System.out.println(list);
		}
	}
	
	public static List<List<Seat>> getListSeat() {
		
		Seat a1 = new Seat("A", 1, 50000);
		Seat a2 = new Seat("A", 2, 50000);
		Seat a3 = new Seat("A", 3, 50000);
		Seat a4 = new Seat("A", 4, 50000);
		Seat a5 = new Seat("A", 5, 50000);
		Seat a6 = new Seat("A", 6, 50000);
		Seat a7 = new Seat("A", 7, 50000);
		Seat a8 = new Seat("A", 8, 50000);

		
		Seat b1 = new Seat("B", 1, 50000);
		Seat b2 = new Seat("B", 2, 50000);
		Seat b3 = new Seat("B", 3, 50000);
		Seat b4 = new Seat("B", 4, 50000);
		Seat b5 = new Seat("B", 5, 50000);
		Seat b6 = new Seat("B", 6, 50000);
		Seat b7 = new Seat("B", 7, 50000);
		Seat b8 = new Seat("B", 8, 50000);

		
		Seat c1 = new Seat("C", 1, 50000);
		Seat c2 = new Seat("C", 2, 50000);
		Seat c3 = new Seat("C", 3, 50000);
		Seat c4 = new Seat("C", 4, 50000);
		Seat c5 = new Seat("C", 5, 50000);
		Seat c6 = new Seat("C", 6, 50000);
		Seat c7 = new Seat("C", 7, 50000);
		Seat c8 = new Seat("C", 8, 50000);

		
		Seat d1 = new Seat("D", 1, 55000);
		Seat d2 = new Seat("D", 2, 55000);
		Seat d3 = new Seat("D", 3, 55000);
		Seat d4 = new Seat("D", 4, 55000);
		Seat d5 = new Seat("D", 5, 55000);
		Seat d6 = new Seat("D", 6, 55000);
		Seat d7 = new Seat("D", 7, 55000);
		Seat d8 = new Seat("D", 8, 55000);

		
		Seat e1 = new Seat("E", 1, 55000);
		Seat e2 = new Seat("E", 2, 55000);
		Seat e3 = new Seat("E", 3, 55000);
		Seat e4 = new Seat("E", 4, 55000);
		Seat e5 = new Seat("E", 5, 55000);
		Seat e6 = new Seat("E", 6, 55000);
		Seat e7 = new Seat("E", 7, 55000);
		Seat e8 = new Seat("E", 8, 55000);

		
		Seat f1 = new Seat("F", 1, 55000);
		Seat f2 = new Seat("F", 2, 55000);
		Seat f3 = new Seat("F", 3, 55000);
		Seat f4 = new Seat("F", 4, 55000);
		Seat f5 = new Seat("F", 5, 55000);
		Seat f6 = new Seat("F", 6, 55000);
		Seat f7 = new Seat("F", 7, 55000);
		Seat f8 = new Seat("F", 8, 55000);

		
		Seat g1 = new Seat("G", 1, 55000);
		Seat g2 = new Seat("G", 2, 55000);
		Seat g3 = new Seat("G", 3, 55000);
		Seat g4 = new Seat("G", 4, 55000);
		Seat g5 = new Seat("G", 5, 55000);
		Seat g6 = new Seat("G", 6, 55000);
		Seat g7 = new Seat("G", 7, 55000);
		Seat g8 = new Seat("G", 8, 55000);


		List<Seat> listSeatA = new ArrayList<>();
		listSeatA.add(a1);
		listSeatA.add(a2);
		listSeatA.add(a3);
		listSeatA.add(a4);
		listSeatA.add(a5);
		listSeatA.add(a6);
		listSeatA.add(a7);
		listSeatA.add(a8);

		List<Seat> listSeatB = new ArrayList<>();
		listSeatB.add(b1);
		listSeatB.add(b2);
		listSeatB.add(b3);
		listSeatB.add(b4);
		listSeatB.add(b5);
		listSeatB.add(b6);
		listSeatB.add(b7);
		listSeatB.add(b8);

		List<Seat> listSeatC = new ArrayList<>();
		listSeatC.add(c1);
		listSeatC.add(c2);
		listSeatC.add(c3);
		listSeatC.add(c4);
		listSeatC.add(c5);
		listSeatC.add(c6);
		listSeatC.add(c7);
		listSeatC.add(c8);

		List<Seat> listSeatD = new ArrayList<>();
		listSeatD.add(d1);
		listSeatD.add(d2);
		listSeatD.add(d3);
		listSeatD.add(d4);
		listSeatD.add(d5);
		listSeatD.add(d6);
		listSeatD.add(d7);
		listSeatD.add(d8);

		List<Seat> listSeatE = new ArrayList<>();
		listSeatE.add(e1);
		listSeatE.add(e2);
		listSeatE.add(e3);
		listSeatE.add(e4);
		listSeatE.add(e5);
		listSeatE.add(e6);
		listSeatE.add(e7);
		listSeatE.add(e8);

		List<Seat> listSeatF = new ArrayList<>();
		listSeatF.add(f1);
		listSeatF.add(f2);
		listSeatF.add(f3);
		listSeatF.add(f4);
		listSeatF.add(f5);
		listSeatF.add(f6);
		listSeatF.add(f7);
		listSeatF.add(f8);

		List<Seat> listSeatG = new ArrayList<>();
		listSeatG.add(g1);
		listSeatG.add(g2);
		listSeatG.add(g3);
		listSeatG.add(g4);
		listSeatG.add(g5);
		listSeatG.add(g6);
		listSeatG.add(g7);
		listSeatG.add(g8);
		
		List<List<Seat>> listSeat = new ArrayList<>();
		listSeat.add(listSeatA);
		listSeat.add(listSeatB);
		listSeat.add(listSeatC);
		listSeat.add(listSeatD);
		listSeat.add(listSeatE);
		listSeat.add(listSeatF);
		listSeat.add(listSeatG);
		
		return listSeat;
	}
}
