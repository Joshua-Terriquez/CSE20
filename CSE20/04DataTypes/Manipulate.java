import java.util.Scanner;
public class Manipulate {

	public static void main(String[] args) {
	Scanner kbinput=new Scanner(System.in);
	int Num1;
	int Num2;
	short Num3;
	short Num4;
	float Num5;
	float Num6;
	double Num7;
	double Num8;
	System.out.println("Input 2 integers: ");
	Num1 = kbinput.nextInt();
	Num2=kbinput.nextInt();
	System.out.println("");
	
	System.out.println("Sum of "+ Num1 +" and " + Num2 + " is " + (int)(Num1 + Num2));
	System.out.println("Difference of "+ Num1 +" and "+ Num2+ " is "+ (int)(Num1-Num2));
	System.out.println("Product of "+ Num1+ " and "+ Num2 + " is "+(int)(Num1*Num2));
	System.out.println("Integer cast of "+ "("+ Num1 + " / " + Num2 +")"+" is "+ (int)(Num1/Num2));
	System.out.println("Integer cast of "+ "(" + Num1 + " % " + Num2 + ")" + " is " + (int)(Num1%Num2));
	System.out.println("");
	
	System.out.println("Input two shorts:  (-32,768 to 32,767) ");
	Num3=kbinput.nextShort();
	Num4=kbinput.nextShort();
	System.out.println("Sum of "+Num3+" and "+Num4+" is "+(short)(Num3+Num4));
	System.out.println("Difference of "+ Num3 +" and "+ Num4+ " is "+ (short)(Num3-Num4));
	System.out.println("Product of "+ Num3+ " and "+ Num4 + " is "+(short)(Num3*Num4));
	System.out.println("Integer cast of "+ "("+Num3+" / "+Num4 +")"+" is "+ (short)(Num3/Num4));
	System.out.println("Integer cast of "+ "(" + Num3 + " % " + Num4 + ")" + " is " + (short)(Num3%Num4));
	System.out.println("");
	
	System.out.println("Input two floating point: ");
	Num5=kbinput.nextFloat();
	Num6=kbinput.nextFloat();
	System.out.println("Sum of "+Num5+" and "+Num6+" is "+(float)(Num5+Num6));
	System.out.println("Difference of "+ Num5 +" and "+ Num6+ " is "+ (float)(Num5-Num6));
	System.out.println("Product of "+ Num5+ " and "+ Num6 + " is "+(float)(Num5*Num6));
	System.out.println("Integer cast of "+ "("+Num5+" / "+Num6 +")"+" is "+ (float)(Num5/Num6));
	System.out.println("Integer cast of "+ "(" + Num5 + " % " + Num6 + ")" + " is " + (float)(Num5%Num6));
	System.out.println("");
	
	System.out.println("Input two doubles: ");
	Num7=kbinput.nextDouble();
	Num8=kbinput.nextDouble();
	System.out.println("Sum of "+Num7+" and "+Num8+" is "+(double)(Num7+Num8));
	System.out.println("Difference of "+ Num7 +" and "+ Num8+ " is "+ (double)(Num7-Num8));
	System.out.println("Product of "+ Num7+ " and "+ Num8 + " is "+(double)(Num7*Num8));
	System.out.println("Integer cast of "+ "("+Num7+" / "+Num8 +")"+" is "+ (double)(Num7/Num8));
	System.out.println("Integer cast of "+ "(" + Num7 + " % " + Num8 + ")" + " is " + (double)(Num7%Num8));
	System.out.println("");
	
	}

}
