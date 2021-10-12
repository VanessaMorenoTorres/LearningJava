package oopConcepts;

public class Employee extends Person{
	double hourlyRate;
	String healthIns;
	
	public Employee(String firstName, String lastName, int age, double hourlyRate, String healthIns) {
		super(firstName, lastName, age);
		this.hourlyRate = hourlyRate;
		this.healthIns = healthIns;
	}
	
	
	public Employee( double hourlyRate, String healthIns) {
		this.hourlyRate = hourlyRate;
		this.healthIns = healthIns;
	}


	public Employee() {
	}


	void display(){
		System.out.println("Hourly rate: "+ this.hourlyRate);
		System.out.println("Has health insurance: "+ this.healthIns);
	}
}
