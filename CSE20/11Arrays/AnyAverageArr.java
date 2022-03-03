import java.util.Scanner;
public class AnyAverageArr {

	public static void main(String[] args) {
		int max,colmnWidth;
		double sum=0;
		int i=1;
		int m=1;
		Scanner input= new Scanner (System.in);
	System.out.println("This program will find the average of any set of numbers.");
	System.out.println("");
	System.out.print("Please choose number of values to average: ");
	 max= input.nextInt();
	System.out.print("Please choose column width for output formatting: ");
	 colmnWidth= input.nextInt(); 
	System.out.println("");
	
	int[] arr1 = new int[max+1];
	arr1[i]=0;
     for(i= 1;i <= max;i++) {
    	 arr1[i] = (arr1[i-1]+i);
    	 System.out.print("Please enter value #"+i+": ");
    	 arr1[i]=input.nextInt();
    	 sum+=  arr1[i];
     }
     System.out.println("The numbers being average are ...");
     
     for(i=1;i <= max;i++) {
    	 System.out.print(arr1[i]+" ");
    	 if (i%colmnWidth==0) {
    		 System.out.println();
    	 }
     }
     System.out.println("");
     System.out.println("");
     System.out.println("Average is "+(sum/max));
	}

	}
