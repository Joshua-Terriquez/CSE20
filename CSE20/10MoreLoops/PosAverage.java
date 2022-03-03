import java.util.Scanner;
public class PosAverage {
	public static void main(String[] args) {
		
	Scanner input= new Scanner(System.in);
    System.out.println("Enter 0 or less to stop entering numbers.");
    int total=0, i=0, inPut, sum=0;
    double avgNum;
    do { 
    	i++;
    	System.out.print("Enter value #"+i+": ");
        inPut=input.nextInt();
       if(inPut > 0) {
    	   total+= inPut;
       }else{
    	   
       
       } while (inPut > 0);
       {
       sum+=i;
	   avgNum= (total/sum);
	   
	       if((inPut <= 0)&&(avgNum <= 0)) {
	    System.out.println("No positive numbers were input.");
	
	       }else {
		System.out.println(("Average is "+avgNum));
    }
	
	
       
    
	
	
    

