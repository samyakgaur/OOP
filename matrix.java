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
		System.out.println("Enter the elements of the matrix");
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
			System.out.println("Enter the rows and columns for the matrix: ");
			int r1=sc1.nextInt();
			int c1=sc1.nextInt();
			matrix  m1= new matrix(r1,c1);
			m1.readmat();
			m1.display();	
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
