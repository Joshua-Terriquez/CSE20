import java.util.Scanner;

public class ChooseFunc {

	public static void main(String[] args) {

		System.out.println("This program supports 4 functions of a max number:");
		System.out.println("\t1. SumAll");
		System.out.println("\t2. SumSquare");
		System.out.println("\t3. Factorial");
		System.out.println("\t4. Fibonacci");

		Scanner input = new Scanner(System.in);
		int func, max, i;
		long [] resArr;

		while (true) {
		//for(;;) {
			System.out.println();
			System.out.print("Please choose the function you want: ");
			func = input.nextInt();

			System.out.print("Please enter the max number (> 0): ");
			max = input.nextInt();
			resArr = new long [max+1];
		
			for (i = 1; i <= max; i++) {
				if (func == 1) {
	//Sum all
					resArr[i] = resArr[i-1] + i;
				} else if (func == 2) {
	//Fill-in(SumSquare)
					resArr[i]= resArr[i-1]+(i*i);
				} else if (func == 3) {
	// Fill-in (Factorial)
					if(i-1==0) {
						resArr[0]=1;
					resArr[i]=i*resArr[i-1];
					}
					else {
					resArr[i]=i*resArr[i-1];
					}
				} else if (func == 4) {
	// Fill-in (Fibonacci)
					if(i==1) {
					resArr[0]=0;
					resArr[1]=1;
					
					}
					else {
						resArr[i]=resArr[i-1]+resArr[i-2];
					}
				} else {
					System.out.println("Error: " + func + " is an invalid choice for function.");
					break;
					// Fill-in (Stop the for-loop from iterating)
				}
			}
			System.out.println("");
			System.out.print("Do you wish to repeat your inputs? (1 for yes): ");
			if (input.nextInt() == 1) {
				continue;
				
				// Fill-in (should go back to top of the while-loop)
			}
			System.out.println("");
			System.out.print("Do you wish to print the results? (1 for yes): ");
			if (input.nextInt() == 1) {
				System.out.println("Results in the array:");
				System.out.println("\tIndex\tValue");
				for (i = 0; i <= max; i++) {
					System.out.println("\t"+i+"\t"+resArr[i]);
					// Fill-in (print out the array index and the content)
				}
					
			}
			System.out.println();
			System.out.print("Do you wish to quit the program? (1 for yes): ");
			if (input.nextInt() == 1) {
				break;
				// Fill-in (End the while(true) loop)
			}
		}
	}
}