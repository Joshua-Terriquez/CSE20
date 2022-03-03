import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;
          
		//Scanner kbd; // this doesn't work

		System.out.println("This program asks the user for two integers and calculates their sum as an integer.");

	   Scanner kbd = new Scanner(System.in); // add Scanner 
               //kbd= new Scanner(System.in);
	   System.out.println("Enter the first number: ");
		n1 = kbd.nextInt();
       //System.out.print("Enter the first number: "); //added ln and moved this code to the right order

		System.out.println("Enter the second number: ");
		n2 = kbd.nextShort();
		
        //System.out.println("The sum of the number is " + (float)(n1+n2);
		System.out.println("The sum of the numbers is " + (int)(n1+n2));
		// instead of casting float.. It should really be casted to int.
	}

}