import java.util.Scanner;
public class SumAll {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.print("Please ener the max amount of numbers to add: ");
		int max=input.nextInt();
		int i=0,Sum=0;
		
		while(i<=max) {
		System.out.println("Number "+ i);
           Sum+= i;
           i++;
        }
	
        System.out.println("the sum of all numbers from 0 till "+ max +" is: "+ Sum);
	}

}
