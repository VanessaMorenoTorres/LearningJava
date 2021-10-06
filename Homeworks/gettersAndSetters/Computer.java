package gettersAndSetters;
//import java.util.Scanner;

public class Computer {
	private String name;
	private int year;
	private double cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Computer(String name, int year, double cost) {
		this.name = name;
		this.year = year;
		this.cost = cost;
	}
	public Computer() {
	}	
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.setName("Toshiba");
		c1.setYear(2010);
		c1.setCost(499.99);
		
		System.out.println(c1.getName());
		System.out.println(c1.getYear());
		System.out.println(c1.getCost());
		
		Computer c2 = new Computer("Jarvis", 2010, 1458.25);
		System.out.println(c2.getName());
		System.out.println(c2.getYear());
		System.out.println(c2.getCost());
	}	
}