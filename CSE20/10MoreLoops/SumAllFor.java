import java.util.Scanner;
public class SumAllFor {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter the max amount of numbers to add: ");
		int max=input.nextInt();
		int sum=0;
		
		for(int i = 0; i <= max ; i++) {
			System.out.println("Number "+ i);
			sum+= i;
		}
		System.out.println("the sum of all numbers from 0 till "+ max+" is: "+sum);
	}

}
