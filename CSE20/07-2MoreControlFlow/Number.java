import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		char cat;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number 1-26: ");
		double num = input.nextDouble();
	
	if((num>0) && (num<27.0)) {
    cat= (char) (num+64);
	System.out.print("Character "+ num +" of the aplhabet is "+ cat);
	}
	else {
	System.out.println("Invalid input! Number is outside of the acceptable range.");
	}
	
}

}
