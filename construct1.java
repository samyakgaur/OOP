/* 
Samyak Gaur(8604)
Batch B

A program to take input from command line and print it
*/

import java.util.*;
class construct1
{
	int a;
	float f;
	double d;
	String s;
	//making a custom constructor
	construct1(){
	a=1;
	f=5;
	d=10.0;
	s="abc";
	}
	public static void main(String args[])
		{
			construct1 ob = new construct1();
			System.out.println("value of a : "+ob.a);
			System.out.println("value of f : "+ob.f);
			System.out.println("value of d : "+ob.d);
			System.out.println("value of s : "+ob.s);		
		}	//End of main	

}	//End of class cmdinput


/*
Output is as follows :
USING DEFAULT CONSTRUCTOR
universe@dell15:~/Desktop/8604$ javac construct1.java
universe@dell15:~/Desktop/8604$ java construct1
value of a : 0
value of f : 0.0
value of d : 0.0

MAKING A CUSTOM CONSTRUCTOR
universe@dell15:~/Desktop/8604$ javac construct1.java
universe@dell15:~/Desktop/8604$ java construct1
value of a : 1
value of f : 0.0
value of d : 10.0
value of s : abc

*/ 
