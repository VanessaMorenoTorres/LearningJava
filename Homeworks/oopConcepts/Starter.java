package oopConcepts;
import java.util.Scanner;

public class Starter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the person first name:");
		String fname = scan.next();
		System.out.println("Enter the person last name:");
		String lname = scan.next();
		System.out.println("Enter the person age:");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("is this person a student? enter Y or N:");
		char stu = scan.next().charAt(0);
		scan.nextLine();
//		System.out.println("is this person an employee? enter Y or N:");
//		char emp = scan.next().charAt(0);
		Person p1 = new Person(fname, lname, age);
		p1.display();
		
		scan.close();
	}
	Scanner scan = new Scanner(System.in);
	void isStudent(char x) {
		
		if (x == 'Y'){
				System.out.println("What is your major:");
				String major = scan.next();
				System.out.println("What is your expected graduation year:");
				int year = scan.nextInt();
				scan.nextLine();
				Student s1 = new Student(major, year);
				s1.display();
		}
		else {
			System.out.println("is this person an employee? enter Y or N:");
			char emp = scan.next().charAt(0);
			scan.nextLine();
			if(emp == 'Y') {
				System.out.println("What is your hourly rate?");
				double hourly = scan.nextDouble();
				System.out.println("Do you have health insurance?");
				String health = scan.next();
				Employee e1 = new Employee(hourly, health);
				e1.display();
			}
		}
	}

}
