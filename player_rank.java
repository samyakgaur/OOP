/* 
Samyak Gaur(8604)
Batch B

write a program to implement code for managing a library
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.math.*;


class player{
	String name,nation;
	int age;
	double runs;
	player(String name,String nation,int age,double runs){
		this.name=name;
		this.nation=nation;
		this.age=age;
		this.runs=runs;
	}
	void display(){		
		System.out.println(name+"\t"+nation+"\t\t"+age+"\t\t"+runs);
			}//End of display function
}//End of class Books 


public class player_rank{
	public static void main(String [] args){
		Scanner sc=new Scanner (System.in);
		int x=0,y,i,age;
		double runs;
		String name,nation;
		player []b=new player[10];
		player temp = new player("name","team",0,0.0);
		System.out.print("Enter the number of players to enter:");
		int number=sc.nextInt();
		for(i=0;i<number;i++){
			System.out.print("Enter the name of the player "+(i+1)+":");
			name=sc.next();
			System.out.print("Enter the team of the player "+(i+1)+":");
			nation=sc.next();
			System.out.print("Enter the age of the player "+(i+1)+":");
			age=sc.nextInt();
			System.out.print("Enter the runs scored by the player "+(i+1)+":");
			runs=sc.nextDouble();
			b[i]=new player(name,nation,age,runs);
		}//End of for loop
		System.out.println("Rank\tName\tTeam\t\tAge\t\tRuns");
		for(i=0;i<number;i++)
		{
			for(int j=0 ;j<i;j++){
				if(b[j].runs<b[j+1].runs){
					temp=b[j+1];
					b[j+1]=b[j];
					b[j]=temp;
				}//End of if case
			}//End of j loop
		}//End of for i loop
		for(i=0;i<number;i++){
			System.out.print((i+1)+"\t");
			b[i].display();
		}
	}//End of main class	
}//End of class Library

/*
universe@dell15:~/Desktop/8604$ javac player_rank.java 
universe@dell15:~/Desktop/8604$ java player_rank
Enter the number of players to enter:3
Enter the name of the player 1:player1
Enter the team of the player 1:team1
Enter the age of the player 1:19
Enter the runs scored by the player 1:10
Enter the name of the player 2:player2
Enter the team of the player 2:team2
Enter the age of the player 2:19
Enter the runs scored by the player 2:5000
Enter the name of the player 3:player3
Enter the team of the player 3:team3
Enter the age of the player 3:19
Enter the runs scored by the player 3:100
Rank	Name	Team		Age		Runs
1	player2	team2		19		5000.0
2	player3	team3		19		100.0
3	player1	team1		19		10.0

*/
