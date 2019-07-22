/* 
Samyak Gaur(8604)
Batch B

A program to take input from command line and print it
*/

import java.util.*;
class cmdinput
{
	public static void main(String args[])
		{
			
			System.out.println("the char is: "+args[0]);
		}	//End of main	

}	//End of class cmdinput


/*
Output is as follows :

/* 
Samyak Gaur(8604)
Batch B

To create an object and use it follow the given step:
> import java.util.*;
> create object of scanner class 
> to use inbuild method to take input 
*/

import java.util.*;
class program3
{
	public static void main(String args[])
		{
			int a; 
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a number to input: ");
			a = sc.nextInt();	
			System.out.println("The entered number is: "+a);
			System.out.print("Enter a String: ");
			s = sc.next();
			System.out.println("The entered string is: "+s);
		}	//End of main	

}	//End of class program3


/*
Output is as follows :

universe@dell15:~/Desktop$ java program3
Enter a number to input: 4
The entered number is: 4
Enter a String: samyak
The entered string is: samyak

*/
