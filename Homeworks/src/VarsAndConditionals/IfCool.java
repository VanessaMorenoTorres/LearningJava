package VarsAndConditionals;
/* Store a number in a variable called number and write an if statement: 
If number is odd, display "Cool"
If number is even and between 2-5, display "Not Cool"
If number is even and between 6-20, display "Cool"
If number is even and greater than 20, display "Not Cool */

public class IfCool {
	public static void main(String[] args) {
		int num = 55;
		
		if(num%2 != 0) {
			System.out.println("Cool");
		}
		else if(num%2==0 && num>20) {
			System.out.println("Not Cool");
		}
		else if(num%2==0 && 2<num && num<5) {
			System.out.println("Not Cool");
		}
		else if(num%2==0 && 6<num && num<20) {
			System.out.println("Cool");
		}
		else {
			System.out.println("not defined");
		}
	}
}
