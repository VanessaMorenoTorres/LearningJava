package VarsAndConditionals;

/*Write an if/else statement for the following requirements:
-If student gets 90 or higher: console log  A
-If students get 80 or above: console log B
-If students get 70 or above: console log C
-If students get 55 or above: console log D
-Any grade lower than 55 is F 
In this class, values are had coded*/

public class IfElse {
	public static void main(String[] args) {
		grades(97);
		grades(44);
		grades(75);
		grades(88);
		grades(60);
	}
	public static void grades(int grade) {
		if(grade >=90) {
			System.out.println("Your grade was " + grade + ", you received an A");
		}
		else if(grade<90 && grade>=80) {
			System.out.println("Your grade was " +grade + ", you received a B");
		}
		else if(grade<80 && grade>=70) {
			System.out.println("Your grade was " +grade + ", you received a C");
		}
		else if(grade<70 && grade>=55) {
			System.out.println("Your grade was " +grade + ", you received a D");
		}
		else{
			System.out.println("Your grade was " +grade + ", you received an F");
		}
	}
}
