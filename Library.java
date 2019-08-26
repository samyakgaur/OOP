/* 
Samyak Gaur(8604)
Batch B

write a program to implement code for managing a library
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.math.*;


class Books{
	String auth,title1,publ;
	double price;
	int stock;
	Books(String auth,String title1,String publ,double price,int stock){
		this.auth=auth;
		this.title1=title1;
		this.publ=publ;
		this.price=price;
		this.stock=stock;
	}	
	boolean searchBook(String author,String title){
		if(auth.equals(author) && title1.equals(title)){
			System.out.println("The books is found! and we have the following copies available:"+stock);
			return true;
		}//End of if condition
		else{
			System.out.println("The book is not available");
			return false;
		}//End of else condition
	}//End of searchbook function
	
	void display(){
		System.out.println(auth+"\t"+title1+"\t"+publ+"\t\t"+price+"\t"+stock);
			}//End of display function
}//End of class Books 


public class Library{
	public static void main(String [] args){
		Scanner sc=new Scanner (System.in);
		int stock,x=0,y,i;
		double price;
		String auth,titl,publ;
		Books []b=new Books[10];
		System.out.print("Enter the number of books to enter:");
		int number=sc.nextInt();
		for(i=0;i<number;i++){
			System.out.print("Enter the price of book "+(i+1)+":");
			price=sc.nextDouble();
			System.out.print("Enter the stock of book "+(i+1)+":");
			stock=sc.nextInt();
			System.out.print("Enter the Author name of book "+(i+1)+":");
			auth=sc.next();
			System.out.print("Enter the Publisher name of book "+(i+1)+":");
			publ=sc.next();
			System.out.print("Enter the Title name of book "+(i+1)+":");
			titl=sc.next();
			b[i]=new Books(auth,titl,publ,price,stock);
		}//End of for loop
		System.out.println("Author\tTitle\tPublisher\tPrice\tStock");
		for(i=0;i<number;i++)
		{
			b[i].display();
		}
		System.out.println("Enter the Author and Title of the Book you want to search :");
		auth=sc.next();
		titl=sc.next();
		for(i=0;i<number;i++){
			if(b[i].searchBook(auth,titl)){
				x=b[i].stock;
				break;
			}//End of if condition
			else 
				System.exit(0);
		}//End of for loop
		System.out.println("Enter the required copies of the book which is searched : ");
		y=sc.nextInt();
		if(y<=x)
			System.out.println("There are sufficient copies available ");
		else
			System.out.println("No Copies available ");
	}//End of main class	
}//End of  class

