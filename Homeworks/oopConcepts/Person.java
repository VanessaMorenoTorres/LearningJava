package oopConcepts;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public Person() {
	
	}
	
	void display(){
		System.out.println("First name: "+ this.firstName);
		System.out.println("Last name: "+ this.lastName);
		System.out.println("Age: "+ this.age);
	}

}
