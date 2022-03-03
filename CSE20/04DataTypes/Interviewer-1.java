import java.util.Scanner;
public class Interviewer {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  String name;
	  int age;
	  String hometown;
	  String major;
	  String year;
	  float height;
	  System.out.println("What is your first name? ");
	  name = input.next(); 
	  System.out.println("Hold old are you? ");
	  age= input.nextInt();
	  System.out.println("Where do you live? ");
	  hometown=input.next();
	  System.out.println("What's your major? ");
	  major=input.next();
	  System.out.println("What year are you in college?");
	  year = input.next();
	  System.out.println("What is your height? (in inches) ");
	  input.nextLine();
	  height=input.nextFloat();
	  System.out.println("");
	  System.out.print("So your name is " + name+",");
	  System.out.print(" You're "+ age+ " years old and");
	  System.out.println(" you currently live in "+hometown+".");
	  System.out.print("Your current major is "+ major+" and");
	  System.out.println(" you have been at UC Merced for about " +year+" year.");
	  System.out.print("According to your height in inches... You are "+ (height*2.54)+" centimeters tall. ");
	  
	
	}

}
