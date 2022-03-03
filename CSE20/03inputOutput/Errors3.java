import java.util.Scanner;

public class Errors3{ //missing bracket

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); //parenthesis missing
		int numerator;          // both lines improperly mispelled int
		int denominator;

		System.out.println("This program divides two numbers."); //.out
		System.out.print("Enter the numerator: ");  //.out
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt(); //mispelled denominator

		System.out.print(numerator);// S
		System.out.print("/");
		System.out.print(denominator); //S
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
	}
}