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

universe@dell15:~/Desktop$ java cmdinput 4
the char is: 4

we can also use it to display strings/numbers by proper typecasting for example 
universe@dell15:~/Desktop$ java cmdinput samyak
the char is: samyak

we can print the second word by changing args[0] to args[1]
for example, 
universe@dell15:~/Desktop$ java cmdinput samyak gaur
the char is: gaur
*/
