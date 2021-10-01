package VarsAndConditionals;

/*Using switch case, do the following:
Store a number between 1-7
If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
Anything other than 1-7 would default to "Invalid Input" 
In this class values are hard coded*/

public class SwitchCase {
	public static void main(String[] args) {
		days(4);
		days(10);
		days(1);
	}
	public static void days(int day) {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default: 
			System.out.println("not a valid entry");
		}
	}
}