import java.util.Scanner;
public class Interviewer {
  public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  String name;
	  int age;
	  String hometown;
	  String major;
	  String year;
	  System.out.println("What is your first name? ");
	  name = input.next(); 
	  System.out.println("Hold old are you? ");
	  age= input.nextInt();
	  System.out.println("Where do you live? ");
	  hometown=input.next();
	  System.out.println("Whats your major? ");
	  major=input.next();
	  System.out.println("What year are you in college?");
	  year = input.next();
	  System.out.println("");
	  System.out.println("Their name is: " + name);
	  System.out.println(name+" age: "+ age);
	  System.out.println(name+ " hometown: "+hometown);
	  System.out.println(name+ " major: "+ major);
	  System.out.println(name+ " year at UC Merced: " +year);
	  
	
	}

}
