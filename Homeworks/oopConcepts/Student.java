package oopConcepts;

public class Student extends Person{
	String major;
	int gradYear;
	
	public Student(String firstName, String lastName, int age, String major, int gradYear) {
		super(firstName, lastName, age);
		this.major = major;
		this.gradYear = gradYear;
	}

	public Student(String major, int gradYear) {
		this.major = major;
		this.gradYear = gradYear;
	}
	
	public Student() {
		
	}
	
	void display(){
		System.out.println("First name: "+ this.major);
		System.out.println("Last name: "+ this.gradYear);
	}
	
}
