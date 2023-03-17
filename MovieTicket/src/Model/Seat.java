package Model;

public class Seat {
	private String row;
	private int number;
	private double cost;
	
	public Seat(String row, int number, double cost) {
		this.row = row;
		this.number = number;
		this.cost = cost;
	}

	public String getRow() {
		return row;
	}

	public void setRow(String row) {
		this.row = row;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Seat [" + row + number + ", " + cost + "]";
	}
	
	
}
