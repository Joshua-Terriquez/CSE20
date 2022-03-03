import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Please enter the maximum number: ");
		int max=input.nextInt();
		int sqreAnsr,sum=0;
		
		for(int i=1; i<=max; i++) {
			sqreAnsr=i*i;
			System.out.println("Number "+i+" squared is "+sqreAnsr);
		 sum+= sqreAnsr;
		}
	  System.out.println("");
      System.out.println("The sum of squares of all numbers from 1 till "+ max + " is: "+ sum );
	}

}
