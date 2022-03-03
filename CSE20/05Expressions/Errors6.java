import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average); // add ln for readability
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
		Scanner input2 = new Scanner(System.in);  //renamed variables due to the above being the same

		float n5, n3; //renamed variables due to the above being the same

		System.out.print("Please enter the first number:");
		n5 = input2.nextFloat();  //renamed variables due to the above being the same

		System.out.print("Please enter the second number: ");
		n3 = input2.nextFloat();  //renamed variables due to the above being the same

		float avg;
		avg = (n5+n3)/2;
		System.out.println("The average of the numbers is " + avg);  // added ln
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
		Scanner input3 = new Scanner (System.in);  // this section of code for Shorts was missing a whole scanner line of code.
		short s1, s2;
        
		System.out.print("Please enter the first number: ");
		s1 = input3.nextShort();

		System.out.print("Please enter the second number: ");
		s2 = input3.nextShort();

		short shortAvg;
		shortAvg = (short) ((short)(s1+s2)/2);// fixed variables.. added short to the outside...
		System.out.println("The average of the numbers is " + shortAvg);// added ln
	}

}
