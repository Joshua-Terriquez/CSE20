import java.util.Scanner;// this code was missing to input

public class Errors1 {

	public static void main(String[] args) 
	{ // <<<---missing bracket
		System.out.println("Can you spot and fix the errors?");
	// the quotes "" on previous line were wrong.

		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in); //missing semicolon 
		n1 = keyboard.nextInt(); //keyboard. wasnt inputted
		n2 = keyboard.nextInt(); //int wasn's capitalized

		System.out.println("The sum of the numbers is");
		System.out.println(n1 + n2); //operator sign was a neg. instead of positive
	}
}