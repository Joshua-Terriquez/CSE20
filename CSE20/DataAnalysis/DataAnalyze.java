import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		int i,SamSize,sum=0,sum2=0,sum3=0,sum4=0;
		double maxVal=0,minVal=0;
		double avg=0,avg2=0,avg3=0,avg4=0;
		Scanner input= new Scanner (System.in);

		System.out.print("Please enter the sample size: ");
		SamSize= input.nextInt();

		switch(SamSize)
		{
		case 0: System.out.println("No data to analyze. Ending program.");
		return;  	
		}
		int[] arr1 = new int[SamSize+1];
		int[] arr2 = new int[SamSize+1];
		int[] arr3 = new int[SamSize+1];
		int[] arr4 = new int[SamSize+1];

		System.out.println("Enter numbers for trial 1");
		for(i=1;i < arr1.length;++i)
		{    
			System.out.print("Enter sample #"+i+": ");
			arr1[i]= input.nextInt();
			sum+=arr1[i];
			avg=sum/SamSize;	
		}

		System.out.println("Enter numbers for trial 2");
		for(i=1;i < arr2.length;i++) {
			System.out.print("Enter sample #"+i+": ");
			arr2[i]= input.nextInt();
			sum2+=arr2[i];
			avg2=sum2/SamSize;
		}
		System.out.println("Enter numbers for trial 3");
		for(i=1;i < arr3.length;i++) {
			System.out.print("Enter sample #"+i+": ");
			arr3[i]= input.nextInt();
			sum3+=arr3[i];
			avg3=sum3/SamSize;
		}
		
		System.out.println("Enter numbers for trial 4");
		for(i=1;i<arr4.length;i++) {
			System.out.print("Enter sample #"+i+": ");
			arr4[i]= input.nextInt();
			sum4+=arr4[i];
			avg4=sum4/SamSize;
		}

		System.out.println(" ");
		System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");

		for(i=1; i < arr1.length; i++) {
			System.out.println("\t"+i+"\t\t"+arr1[i]+"\t\t"+arr2[i]+"\t\t"+arr3[i]+"\t\t"+arr4[i]);
		}
		System.out.println("\t------------------------------------------------------------------------");
		System.out.println("Averages:\t\t"+avg+"\t\t"+avg2+"\t\t"+avg3+"\t\t"+avg4);
		for(i=1;i< arr1.length;i++) {
			if(avg > maxVal) {
				maxVal = avg;
			}
			if(avg2 > maxVal) {
				maxVal=avg2;
			}
			if (avg3 > maxVal) {
				maxVal= avg3;
			}
			if (avg4 > maxVal) {
				maxVal= avg4;
			}
		}

		for (i=1;i<arr1.length;i++) {
			if(avg<=maxVal) {
				minVal=avg;
			}
			if(avg2<=maxVal) {
				minVal=avg2;
			}
			if(avg3<=maxVal) {
				minVal=avg3;
			}
			if(avg4<=maxVal) {
				minVal=avg4;
			}
		}
		System.out.println("\nMin Average: "+ minVal);
		System.out.println("Max Average: "+maxVal);
		System.out.println("");
		if (minVal==maxVal) {
			System.out.print("The Trials match EXACTLY!");
		}
		else if(maxVal<(2*minVal)) {
			System.out.print("The trials concur with each other!");
		}
		else {
			System.out.print("The trials do NOT concur!");
		}
	}
}

