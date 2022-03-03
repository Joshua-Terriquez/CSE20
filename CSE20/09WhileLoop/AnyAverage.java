import java.util.Scanner;
public class AnyAverage {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	System.out.println("This program will find the average of as many numbers as you like.");
	System.out.println("");
	System.out.print("Please choose the numbers of values to average: ");
	int num=input.nextInt();
	
	int i=1,avgNum=0,sum=0;
	double average=0;
	
	while(i <= num) {
		System.out.print("Please enter the "+ i +" number: ");
		avgNum=input.nextInt();
		sum= sum + avgNum;
		average=sum/i;
		i++;
	}
	   
        System.out.println("The average of all the numbers is: "+ average);
	}

}
