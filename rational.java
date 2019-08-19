/*
Samyak Gaur(8604)
Batch B

A program to perform basic operations on rational number
*/


import java.util.*;
import java.lang.*;
import java.math.*;

class rationalopp{
	int a,b;
	Scanner sc = new Scanner(System.in);
	rationalopp(){
		a=0;
		b=0;
	}//End of default constructor

	rationalopp(int x , int y){
		a=x;
		b=y;
	}//End of parameterised constructor 
	void add(rationalopp c1 , rationalopp c2){
		int  x,y;
		if(c1.b==c2.b){
			x=c1.a+c2.a;
			y=c2.b;
		}//End of if case
		else{
			x=(c2.b*c1.a)+(c1.b*c2.a);
			y=c1.b*c2.b;
		}//End of else case
	System.out.print("Answer= "+x+"/"+y);
	}//End of add function
	void subtraction(rationalopp c1 , rationalopp c2){
		int  x,y;
		if(c1.b==c2.b){
			x=c1.a-c2.a;
			y=c2.b;
		}//End of if case
		else{
			x=(c2.b*c1.a)-(c1.b*c2.a);
			y=c1.b*c2.b;
		}//End of else case
		System.out.print("Answer= "+x+"/"+y);
	}//End of subtraction function
	void multiplication(rationalopp c1 , rationalopp c2){
		int  x,y;
		x=c1.a*c2.a;
		y=c1.b*c2.b;
		System.out.print("Answer= "+x+"/"+y);
	}//End of multiplications function
	void division(rationalopp c1 , rationalopp c2){
		int  x,y=0,d;
		x=c1.a*c2.b;
		y=c1.b*c2.a;
		System.out.print("Answer= "+x+"/"+y);
	}//End of division function
}//End of rational operations class

public class rational{
	public static void main(String args[]){
		Scanner sc1 = new Scanner(System.in);
		int choice;
		int user; 
		int num_a,num_b,num_c,num_d;
		System.out.print("Enter a: ");
		num_a = sc1.nextInt();
		System.out.print("Enter b: ");
		num_b = sc1.nextInt();
		System.out.print("Enter c: ");
		num_c = sc1.nextInt();
		System.out.print("Enter d: ");
		num_d = sc1.nextInt();
		rationalopp c1 = new rationalopp(num_a,num_b);
		//Second rational number 
		rationalopp c2 = new rationalopp(num_c,num_d);
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
}//End of rational class

/*
The output of the following code is 
universe@dell15:~/Desktop/8604$ java rational
Enter a: 2
Enter b: 3
Enter c: 3
Enter d: 2

 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication 
 4.Division 
 5.Exit
Enter your choice 3
Answer= 6/6
 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication 
 4.Division 
 5.Exit
Enter your choice 4
Answer= 4/9
universe@dell15:~/Desktop/8604$ javac rational.java
universe@dell15:~/Desktop/8604$ java rational
Enter a: 2
Enter b: 3
Enter c: 2
Enter d: 3

 This calculator can perform the following tasks: 
 1.Add 
 2.Subtract 
 3.Multiplication 
 4.Division 
 5.Exit
Enter your choice 1
Answer= 4/3

*/
