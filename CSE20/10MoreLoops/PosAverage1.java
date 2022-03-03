import java.util.Scanner;
public class PosAverage1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    System.out.println("Enter 0 or less to stop entering numbers.");
	    int total=0, i=1, inPut, sum=0;
	    double avgNum;
	    do { 
	    	
	    	System.out.print("Enter value #"+i+": ");
	        inPut=input.nextInt();
	        if(inPut>0) {
	        	total+=inPut;
	        	i++;
	        }
	        else {
	        	i--;
	        }
	        if((inPut <= 0)&&(total<=0)) {
			    System.out.println("No positive numbers were input.");
			
			       }
	    } while (inPut > 0);
	       {
	       sum+=i;
		   avgNum= ((double)total/sum);
		   if((total>0)&&(avgNum>0)) {
			System.out.println(("Average is "+avgNum));
		   }
		       
	}
	     
}
	
}