import java.util.Scanner;
public class MultiplesFor {

	public static void main(String[] args) {
		int answer1=0;
		Scanner input=new Scanner(System.in);
		System.out.println("This program prints out multiples of a base number till a specified maximum.");
		System.out.print("Please enter the maximum number: ");
		int max= input.nextInt();
		
		System.out.print("Please enter the base number whose multiples to print: ");
		int mul= input.nextInt();
		
	   System.out.println("Multiples of "+ mul +" from 1 till "+ max +" are:");
		
	   for(int i=1; answer1 <= (max - mul); i++) {
		   answer1= mul* i;
	        System.out.println("Number "+answer1);
		}
	}

}
