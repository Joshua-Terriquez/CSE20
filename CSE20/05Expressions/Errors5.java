import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {
        double weight; //always initialize before assigning
        
		System.out.print("What is your weight in kg? " );
		Scanner keyboard = new Scanner(System.in); // added Scanner to variable
			//  keyboard = new Scanner (System.in);
		
		weight = keyboard.nextDouble(); //initialize weight with a double

		//Scanner keyboard; //unnecessary code... if this were to be to the top it would be declared twice
		int age;

		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		//System.out.println("Wow! You are " + (int) (age*6.9) + " in dog years."); 
		System.out.println("Wow! You are " + (double) (age*6.9) + " in dog years."); 
		// casting to int doesn't work as well as double regarding decimals. Due to age * by 6.9
		
		//System.out.println("Your weight in lbs is " + (int) weight * 2.2 + " with no decimal point");
		System.out.println("Your weight in lbs is " + (double) weight * 2.2 + " with no decimal point");
		// weight sometimes have decimals and it should be in double instead of int.
		
	}

}