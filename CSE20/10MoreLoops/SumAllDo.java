import java.util.Scanner;
public class SumAllDo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Please enter the max amount of numbers to add: ");
	
		 int sum=0, i=0, ans;
		int max = input.nextInt();
		
			do { 
			System.out.println("number "+ i ); 
				i++;
				
			} while ( i <= max);
				sum+=i;
			    System.out.println("the sum of all numbers from 0 till "+ max +" is: " + sum);
			} 
}