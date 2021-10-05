package userInputHw;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("type a number between 1 and 20 and we will show you that many numbers in the fibonacci series");
		int num= scan.nextInt();
		fibonacci(num);
		System.out.println();
		System.out.println("type in a number and we will check to see if it is an Armstrong number:");
		int anum = scan.nextInt();
		arm(anum);
		System.out.println();
		System.out.println("type in a word and we will check if it is a palindrome:");
		String word = scan.next();
		palindrome(word);
		scan.close();
	}
	//Write Fibonacci series between the user entered start and end values
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	public static void fibonacci(int n) {
		int num1= 0;
		int num2 = 1;
		for(int i= 0; i<n ; i++) {
			System.out.print(num1 + ", ");
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
	}
	//Determine whether a user entered number is an Armstrong number
	/*An Armstrong number is a number such that the sum of its digits raised to the third power is equal to the number itself.  
	 For example, 371 is an Armstrong number, since 3*3*3 + 7*7*7 + 1*1*1 = 371 */
	public static void arm(int n) {
		int remainingDigits = n;
		int sum = 0;
		while(remainingDigits!=0){
			int digit = remainingDigits%10;
			remainingDigits = remainingDigits/10;
			int product = digit*digit*digit;
			sum += product; 
		}
//		System.out.println(sum);
		if(sum == n) {
			System.out.println(n +" is an Armstrong number");
		}
		else {
			System.out.println(n + " is not an Armstrong number");
		}		
	}
	//Write a program to see if a user entered string is a palindrome or not
	public static void palindrome(String w) {
		int i= 0;
		int j = w.length()-1;
		while(i<j) {
			if (w.charAt(i) != w.charAt(j)) {
				System.out.println(w + " is not a palindrome");
				i++;
				j--;
				break;
			}
			else {
				System.out.println(w + " is a palindrome");
				break;
			}
		}
			
	}
}
