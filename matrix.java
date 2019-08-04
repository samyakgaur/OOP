/* 
Samyak Gaur(8604)
Batch B

A Program to perform actions on two matrix 
1.Input function
2.Display function 
3.Check for sTranspose matrix
4.Check for Symmteric matrix
5.Multiplication of matrix

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

	matrix mulmat(matrix m2){
		matrix temp = new matrix(m2.rows,this.cols);
		if(this.cols == m2.rows)
			for(int i =0 ; i<this.rows;i++)
				for(int j = 0 ;j<m2.cols;j++)
					for(int k =0;k<m2.rows;k++)
						temp.m[i][j]=temp.m[i][j]+(this.m[i][k]*this.m[k][j]);
		else 
		System.out.print("Multiplication not possibke");
		return temp;
	}//End of Multiplication function 

	matrix transpose(){
		matrix temp = new matrix(this.rows,this.cols);
		for(int c =0; c<this.rows;c++)
			for(int d=0;d<this.cols;d++)
				temp.m[d][c]= this.m[c][d];
		return temp;
	}//End of transpose matrix

	void symmetric(){
		if(this.rows!=this.cols)
			System.out.print("The matrix cannot be symmetric as its not a square matrix");
		else{
			boolean condition =true;
			for(int i=0;i<this.rows;i++)
				for(int j =0 ;j<this.cols;j++)
					if(m[i][j]!=m[j][i]){
						condition=false;
						break;
					}
			if(condition)
				System.out.print("The matrix is symmetric");
			else
				System.out.print("The matrix is not symmetric");
		}//End of else condition
	}//End of symmetric function

	public static void main(String args[])
		{	matrix m3;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the rows and columns for the matrix 1 : ");
			int r1=sc1.nextInt();
			int c1=sc1.nextInt();
			matrix  m1= new matrix(r1,c1);
			m1.readmat();	
			System.out.println("Enter the rows and columns for the matrix 2 : ");
			int r2=sc1.nextInt();
			int c2=sc1.nextInt();
			matrix  m2= new matrix(r2,c2);
			m2.readmat();
			while(true){
				System.out.println("Following are the options to perform on matrix:");
				System.out.println("1.Display of Matrix A \n 2.Display of MAtrix B \n 3.Transpose of matrix A  \n 4.Transpose of matrix B  \n 5.Check whether matrix A is symmetric \n 6.Check whether matrix B is symmetric \n 7.Multiplication of matrix \n 8.Exit ");
				int choice = sc1.nextInt();
				switch(choice){
					case 1:
							m1.display();
							break;
					case 2:
							m2.display();
							break;
					case 3:
							m3=m1.transpose();
							m3.display();
							break;
					case 4:
							m3=m2.transpose();
							m3.display();
							break;
					case 5:
							m1.symmetric();
							break;
					case 6:
							m2.symmetric();
							break;
					case 7:
							m3=m1.mulmat(m2);
							m3.display();
							break;
					case 8:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;					
				}//End of switch case			
			}//End of while loop	
		}	//End of main	


}//End of class matrix



/*
(base) Samyaks-MacBook-Air:oop samyakgaur$ java matrix
Enter the rows and columns for the matrix 1 : 
2
2
Enter the elements of the matrix: 1
2
3
4
Enter the rows and columns for the matrix 2 : 
2
2
Enter the elements of the matrix: 1
2
3
4
Following are the options to perform on matrix:
1.Display of Matrix A 
 2.Display of MAtrix B 
 3.Transpose of matrix A  
 4.Transpose of matrix B  
 5.Check whether matrix A is symmetric 
 6.Check whether matrix B is symmetric 
 7.Multiplication of matrix 
 8.Exit 
3
The matrix is: 
1 3 
2 4 
Following are the options to perform on matrix:
1.Display of Matrix A 
 2.Display of MAtrix B 
 3.Transpose of matrix A  
 4.Transpose of matrix B  
 5.Check whether matrix A is symmetric 
 6.Check whether matrix B is symmetric 
 7.Multiplication of matrix 
 8.Exit 
7
The matrix is: 
7 10 
15 22 
Following are the options to perform on matrix:
1.Display of Matrix A 
 2.Display of MAtrix B 
 3.Transpose of matrix A  
 4.Transpose of matrix B  
 5.Check whether matrix A is symmetric 
 6.Check whether matrix B is symmetric 
 7.Multiplication of matrix 
 8.Exit 
6
The matrix is not symmetricFollowing are the options to perform on matrix:
1.Display of Matrix A 
 2.Display of MAtrix B 
 3.Transpose of matrix A  
 4.Transpose of matrix B  
 5.Check whether matrix A is symmetric 
 6.Check whether matrix B is symmetric 
 7.Multiplication of matrix 
 8.Exit 

*/
