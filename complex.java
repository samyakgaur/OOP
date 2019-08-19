/*
Samyak Gaur(8604)
Batch B

A program to perform addition and subtraction on complex numbers
*/


import java.util.*;
import java.lang.*;
import java.math.*;

class complexopp{
	int real,imag;
	Scanner sc = new Scanner(System.in);
	complexopp(){
		real=0;
		imag=0;
	}//End of default constructor

	complexopp(int a , int b){
		real=a;
		imag=b;
	}//End of parameterised constructor 
	void add(complexopp c1 , complexopp c2){
		int  x,y;
		x=c1.real+c2.real;
		y=c1.imag+c2.imag;
		System.out.print("Answer= "+x+"+i"+y);
	}//End of add function
	void subtraction(complexopp c1 , complexopp c2){
		int  x,y;
		x=c1.real-c2.real;
		y=c1.imag-c2.imag;
		System.out.print("Answer= "+x+y+"i");
	}//End of subtraction function
	void multiplication(complexopp c1 , complexopp c2){
		int  x,y;
		x=(c1.real*c2.real)-(c2.imag*c1.imag);
		y=(c1.real*c2.imag)+(c1.imag*c2.real);
		System.out.print("Answer= "+x+"+i"+y);
	}//End of multiplications function
	void division(complexopp c1 , complexopp c2){
		int  x,y=0,d;
		d=(c1.real*c2.real)+(c1.imag*c2.imag);
		x=(c1.real*c2.real)+(c2.imag*c1.imag)/d;
		System.out.print("Answer= "+x+"+i"+y);
	}//End of multiplications function
}//End of complex operations class

public class complex{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		int choice;
		int user; 
		int num1, num2;
		System.out.print("Enter real part: ");
		num1 = sc1.nextInt();
		System.out.print("Enter imaginary part: ");
		num2 = sc1.nextInt();
		complexopp c1 = new complexopp(num1,num2);
		//Second complex number 
		System.out.print("Enter real part: ");
		num1 = sc1.nextInt();
		System.out.print("Enter imaginary part: ");
		num2 = sc1.nextInt();
		complexopp c2 = new complexopp(num1,num2);
		while(true){
				System.out.println("\n This calculator can perform the following tasks: \n 1.Add \n 2.Subtract \n 3.Multiplication \n 4.Division \n 5.Exit");
				System.out.print("Enter your choice ");
				choice = sc1.nextInt();	
				switch(choice){
					case 1:
							c1.add(c1,c2);							
							break;
					case 2:
							c1.subtraction(c1,c2);	
							break;
					case 3:
							c1.multiplication(c1,c2);
							break;
					case 4:
							c1.division(c1,c2);
							break;
					case 5:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 		
			
	}//End of main function 
}//End of complex class

/*
The output of the following code is 
universe@dell15:~/Desktop/8604$ javac complex.java
universe@dell15:~/Desktop/8604$ java complex
Enter real part: 2
Enter imaginary part: 2
Enter real part: 3
Enter imaginary part: 3

 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication  
 4.Division
 5.Exit
Enter your choice 1
Answer= 5+i5
 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication
 4.Division  
 5.Exit
Enter your choice 2
Answer= -1-1i
 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication  
 4.Division
 5.Exit
Enter your choice 3
Answer= 0+i12


*/
