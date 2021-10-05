package calculator;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Select a number from the choices below to continue:");
		System.out.println("1: ADD");
		System.out.println("2: SUBTRACT");
		System.out.println("3: MULTIPLY");
		System.out.println("4: DIVIDE");
		System.out.println("5: EXIT");
		int num = scan.nextInt();
		choice(num);
		scan.close();
	}
	public static void choice(int n) {
	Scanner scan = new Scanner (System.in);
	if(n>=1 && n<=4) {
	System.out.println("choose your first number");
	int num1 = scan.nextInt();
	System.out.println("choose your second number");
	int num2 = scan.nextInt();
	int num3;
		switch(n) {	
		case 1:
			num3 = num1 + num2;
			System.out.println(num1 + " + "+ num2 +" = "+ num3);
			break;
		case 2:
			num3 = num1 - num2;
			System.out.println(num1 + " - "+ num2 +" = "+ num3);
			break;
		case 3:
			num3 = num1 * num2;
			System.out.println(num1 + " * "+ num2 +" = "+ num3);
			break;
		case 4:
			num3 = num1 / num2;
			System.out.println(num1 + " / "+ num2 +" = "+ num3);
			break;}
	}
	else if(n==5) {
		System.out.println("Goodbye");
	}
	else {
		System.out.println("Invalid Entry, Try Again");
	}
	scan.close();
	}
}
