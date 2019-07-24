/* 
Samyak Gaur(8604)
Batch B

Program to implement method overloading and hence make a menu driven program to calculate area of the following shapes:
1.Square
2.Circle
3.Triangle
4.Rectangle 
5.Trapezoid 
6.Parallelogram 
*/
import java.lang.*;
import java.math.*;
import java.util.Scanner;
class methodoverloading 
{
	public static void main(String args[])
		{
			int choice;
			float a , b , result=0 , d = 0.5f;; 
			methodoverloading obj = new methodoverloading();
			Scanner sc = new Scanner(System.in);
			while(true){
				System.out.println("\n Please select an object to calculate area of : \n 1.Square \n 2.Rectangle \n 3.Triangle \n 4.Trapezoid \n 5.Cylinder \n 6.Exit \n ");
				System.out.print("Enter your choice ");
				choice = sc.nextInt();	
				switch(choice){
					case 1:
							System.out.print("Enter side length of square: ");
							a=sc.nextFloat();
							area(a);
							break;
					case 2:
							System.out.print("Enter Base length: ");
							a=sc.nextFloat();
							System.out.print("Enter Height length: ");
							b=sc.nextFloat();
							area(a,b);
							break;
					case 3:
							System.out.print("Enter height of the triangle: ");
							a=sc.nextFloat();
							System.out.print("Enter base of the triangle: ");
							b=sc.nextFloat(); 
							area(a,b,d);
							break;
					case 4:
							System.out.print("Enter the base 1 of the trapezoid: ");
							a=sc.nextFloat();
							float e; // to store the base 2
							System.out.print("Enter the base 2 of the trapezoid: ");
							e=sc.nextFloat();
							System.out.print("Enter height of the trapezoid: ");
							b=sc.nextFloat();
							area(a,b,d,e);
							break;
					case 5:
							float x,y,z;
							x=3.14f;
							y=2.0f;
							z=0;
							System.out.print("Enter the height: ");
							a=sc.nextFloat();
							System.out.print("Enter the radius: ");							
							b=sc.nextFloat(); 
							area(a,b,x,y,z);
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

static void area(float a ){
	float result;
	result=a*a;
	System.out.println("The area of the sqauare is: "+result);	
}//End of area -square function

static void area(float a , float b){
	float result;
	result=a*b;
	System.out.println("The area of rectangle is: "+result);
}//End of area-rectangle function

static void area(float a , float b , float d){
	float result;
	result=d*a*b;
	System.out.println("The area of triangle is: "+result);	
}//End of area-triangle function

static void area(float a , float b, float d, float e){
	float result;
	result=d*(a+e)*b;
	System.out.println("The area of trapezoid is: "+result);	
}//End of area-trapezoid function

static void area(float a , float b, float x, float y, float z){
	double result;
	result=(a*b*x*y)+(x*y*b*b);
	System.out.println("The area of cylinder is: "+result);	
}//End of area-cylinder function
}	//End of class program3




/*

universe@dell15:~/Desktop/8604$ javac methodoverloading.java
universe@dell15:~/Desktop/8604$ java methodoverloading

 Please select an object to calculate area of : 
 1.Square 
 2.Rectangle 
 3.Triangle 
 4.Trapezoid 
 5.Cylinder 
 6.Exit 
 
Enter your choice 5
Enter the height: 100
Enter the radius: 100
The area of cylinder is: 125600.0

 Please select an object to calculate area of : 
 1.Square 
 2.Rectangle 
 3.Triangle 
 4.Trapezoid 
 5.Cylinder 
 6.Exit 
 
Enter your choice 6
universe@dell15:~/Desktop/8604$ 
*/
