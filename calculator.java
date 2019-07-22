/* 
Samyak Gaur(8604)
Batch B

Program to implement the idea of calculator and give user the following function
1.Add
2.Subtract
3.Division
4.Remainder
5.
*/
import java.lang.*;
import java.math.*;
import java.util.Scanner;
class calculator 
{
	public static void main(String args[])
		{
			int choice;
			float a , b , result=0; 
			Scanner sc = new Scanner(System.in);
			while(true){
				System.out.println("\n This calculator can perform the following tasks: \n 1.Sum \n 2.Subtract \n 3.Multiplication \n 4.Divison \n 5.Power \n 6.Exit");
				System.out.print("Enter your choice ");
				choice = sc.nextInt();	
				switch(choice){
					case 1:
							System.out.print("Enter Number 1: ");
							a=sc.nextFloat();
							System.out.print("Enter Number 2: ");
							b=sc.nextFloat();
							add(a,b);
							break;
					case 2:
							System.out.print("Enter Number 1: ");
							a=sc.nextFloat();
							System.out.print("Enter Number 2: ");
							b=sc.nextFloat();
							subtract(a,b);
							break;
					case 3:
							System.out.print("Enter Number 1: ");
							a=sc.nextFloat();
							System.out.print("Enter Number 2: ");
							b=sc.nextFloat();
							multiplication(a,b);
							break;
					case 4:
							System.out.print("Enter Number 1: ");
							a=sc.nextFloat();
							System.out.print("Enter Number 2: ");
							b=sc.nextFloat();
							division(a,b);
							break;
					case 5:
							double x,y;
							System.out.print("Enter Number: ");
							x=sc.nextDouble();
							System.out.print("Enter Power: ");
							y=sc.nextDouble();
							power(x,y);
							break;
					case 6:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 
		}	//End of main	

static void add(float a , float b){
	float result;
	result=a+b;
	System.out.println("The addition of two numbers are: "+result);	
}//End of add function

static void subtract(float a , float b){
	float result;
	result=a-b;
	System.out.println("The subtraction  of two numbers are: "+result);
}//End of subtraction function

static void multiplication(float a , float b){
	float result;
	result=a*b;
	System.out.println("The multiplication of two numbers are: "+result);	
}//End of multiplication function

static void division(float a , float b){
	float result;
	result=a/b;
	System.out.println("The division of two numbers are: "+result);	
}//End of division function

static void power(double x , double y){
	double result;
	result=Math.pow(x,y);
	System.out.println("The number 1 raised to number 2 is: "+result);	
}//End of power function
}	//End of class program3


/*
Output is as follows :
universe@dell15:~/Desktop/8604$ javac calculator.java
universe@dell15:~/Desktop/8604$ java calculator

 This calculator can perform the following tasks: 
 1.Sum 
 2.Subtract 
 3.Multiplication 
 4.Divison 
 5.Power 
 6.Exit
Enter your choice 1
Enter Number 1: 1
Enter Number 2: 1
The addition of two numbers are: 2.0

 This calculator can perform the following tasks: 
 1.Sum 
 2.Subtract 
 3.Multiplication 
 4.Divison 
 5.Power 
 6.Exit
Enter your choice 5
Enter Number: 1
Enter Power: 2323
The number 1 raised to number 2 is: 1.0

 This calculator can perform the following tasks: 
 1.Sum 
 2.Subtract 
 3.Multiplication 
 4.Divison 
 5.Power 
 6.Exit
Enter your choice 6
universe@dell15:~/Desktop/8604$ 

*/
