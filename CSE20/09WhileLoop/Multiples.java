import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
	  double answer1=0;
		Scanner input= new Scanner(System.in);
	  System.out.println("this program prints out multiples of a given number till a specified maximum.");
	  
      System.out.print("Please enter maximum number: ");
      int max= input.nextInt();
      
      System.out.print("Please enter the number whose multiples to print: ");
      int mul=input.nextInt();
      
      int i=1;
      System.out.println("Multiples of "+ mul +" from 1 till "+ max +" are:");
      while(answer1 <= (max - mul)) {
    	  
    		  answer1= mul* i;
    	  System.out.println("Number "+answer1);
    	  i++;
     }
      
}
	}


