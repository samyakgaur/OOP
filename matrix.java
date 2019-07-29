/* 
Samyak Gaur(8604)
Batch B

A Program to create a employee database and print it in ascending order of their salary 
*/
import java.lang.*;
import java.math.*;
import java.util.*;
import java.io.*;
class matrix 
{	
	int rows, cols;
	int [][]m;
	matrix(int rows, int cols){
		this.rows=rows;
		this.cols=cols;
		m= new int[this.rows][this.cols];
	}//End of parameterized constructor
	void readmat(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements of the matrix: ");
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
				m[i][j]=sc.nextInt();
			}//End of j loop for input of the matrix
		}//End of i loop for input 
	}//End of read matrix function
	void display(){
		System.out.println("The matrix is: ");
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
				System.out.print(m[i][j]+" ");
			}//End of j loop for display of the matrix
			System.out.println();		
		}//End of i loop for display 
	}//End of display function 	
	public static void main(String args[])
		{	
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the rows and columns for the matrix 1 : ");
			int r1=sc1.nextInt();
			int c1=sc1.nextInt();
			matrix  m1= new matrix(r1,c1);
			m1.readmat();
			m1.display();	
			System.out.println("Enter the rows and columns for the matrix 2 : ");
			int r2=sc1.nextInt();
			int c2=sc1.nextInt();
			matrix  m2= new matrix(r2,c2);
			m2.readmat();
			m2.display();
			while(true){
				System.out.println("Following are the options to perform on matrix:");
				System.out.println("\n 1.Input matrix A \n 2.Input matrix B \n 3.Display of Matrix \n 4.Symmetric  \n 5.Transpose \n 6.Exit");
				int choice = sc1.nextInt();
				switch(choice){
					case 1:
							
							break;
					case 2:
							
							break;
					case 3:
							
							break;
					case 4:
							
							break;
					case 5:
							
							break;
					case 6:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;					
				}//End of switch case			
			}//End of while loop	
		}	//End of main	


}//End of class demoempsort



/*
Output of the following code is:
universe@dell15:~/Desktop/8604$ javac matrix.java
universe@dell15:~/Desktop/8604$ java  matrix
Enter the rows and columns for the matrix: 
2
2
Enter the elements of the matrix
1
2
3
4
The matrix is: 
1 2 
3 4 

*/
