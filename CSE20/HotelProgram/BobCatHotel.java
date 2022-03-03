import java.util.Scanner;
import java.util.Random;
public class BobCatHotel {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double a3xDisc = 0, single, dooble, queen, king, aaRspnce, masterSuite, mealCost, preTotalcost, TcOfBooking, choiceRm, baseRmCost;
		int guestN, cMember, numNights, numMealpackage, cRandom = 0, cMemberdisc;
		boolean aaUser0,cMemdisc;
		//Types of Rooms and Costs
		single= 50.50;
		dooble= 75.00;
		queen= 100.75;
		king= 150.25;
		masterSuite= 225.50;
		// Meals

		//complementary=0;
		// standard= 30.00;
		//deluxe=50.00;
		//indulgence=85.00;//(Only available to guests who reserve the Master suite.

		//Greeting and showing services to customer...
		System.out.println("ROOM OPTIONS\n1. Single: $50.50 per night \n2. Double: $75.00 per night\n3. Queen: $100.75 per night \n4. King: $150.25 per night \n5. Master Suite: $225.50 per night");

		// users questions and input
		System.out.print("\nNumber of guest: ");
		guestN=input.nextInt();
		System.out.print("Please your choice of room (enter 1/2/3/4/5 corresponding to the options shown above): ");
		choiceRm=input.nextInt();
		System.out.print("Please enter the number of nights: ");
		numNights=input.nextInt();
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		aaRspnce=input.nextDouble();
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		cMember=input.nextInt();

		// determines whether or not to display the club message
		if(cMember == 1) {
			Random randGen= new Random();
			cRandom=randGen.nextInt(11);
		}  
		else if(cMember == 0) {
			cMemdisc=false;
		}
		if (cRandom>=4) {
			System.out.println("\nCongratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\"\nDiscount will be applied during checkout depending on the number of days\n");
		}
		else if (cRandom<4){
			System.out.println("\nUnfortunately, you did'nt qualify for our \"Stay 4 nights get 1 free promotion\". Better luck\nnext time!\n");
			cMemdisc=false;
		}

		// determines when or not to display the third meal package.
		if(choiceRm>=0 && choiceRm<5) 
		{
			System.out.println("Meal Packages (PRICES SHOWN ARE PER NIGHT)\n0. Complementary @ $0 per guest\n1. Standard @ $30 per guest\n2. Deluxe @ $50 per guest ");
			System.out.print("\nPlease select your desired meal package (\"enter 0/1/2 corresponding to the options shown above\") ");	
		} else if(choiceRm>=5 && choiceRm<=5)
		{
			System.out.println("Meal Packages (PRICES SHOWN ARE PER NIGHT)\n0. Complementary @ $0 per guest\n1. Standard @ $30 per guest\n2. Deluxe @ $50 per guest\n3. Indulgence @ $85 per guest");
			System.out.print("\nPlease select your desired meal package (\"enter 0/1/2/3 corresponding to the options shown above\") ");
		}

		numMealpackage=input.nextInt();
		//assigning users input to its corresponding meal values
		switch(numMealpackage)
		{ case 0: numMealpackage=0; break;
		case  1: numMealpackage=30;  break;
		case 2: numMealpackage=50; break;
		case 3: numMealpackage=85; break;
		}

		//assigning room choices to their respective values
		if (choiceRm==1) {
			choiceRm=single;
		}
		if(choiceRm==2) {
			choiceRm=dooble;
		}
		if(choiceRm==3) { 
			choiceRm=queen;
		}
		if(choiceRm==4) {
			choiceRm=king;
		}
		if(choiceRm==5) {
			choiceRm=masterSuite;
		}
		//calculations of...
		baseRmCost=(choiceRm*numNights);
		mealCost=(guestN*numNights*numMealpackage);
		preTotalcost= (baseRmCost+mealCost);

		System.out.println("\nCHECKOUT");
		System.out.println("Room Cost:\t\t $"+ baseRmCost);

		//if it is equal to 0 than it will not print and equal 0
		if (mealCost>0)
		{
			System.out.println("Meal Cost:\t\t+$"+ mealCost);
		}

		System.out.println("Preliminary Total Cost:  $"+ preTotalcost);
		if(aaRspnce == 1) {
			a3xDisc= preTotalcost * 0.10;
			System.out.println("AAA discount:\t\t-$"+a3xDisc);
		}
		else if (aaRspnce == 0) {
			aaUser0= false;
		}  
		if ((aaRspnce==0) && (cRandom < 4)) { 
			System.out.println("No Discounts Applied");
		}
		double cMemActualD = 0;
		if (cRandom >= 4) { 
			cMemberdisc=(int)(numNights/4);
			cMemActualD=(choiceRm*cMemberdisc);
			System.out.println("Club member: \t\t-$"+cMemActualD);
		}
		TcOfBooking=(preTotalcost-(a3xDisc + cMemActualD));
		System.out.println("Total Cost of Booking: \t $"+ TcOfBooking);
	}    

}




