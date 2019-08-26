/* 
Samyak Gaur(8604)
Batch B

write a program to implement code for managing a brand
*/

import java.util.*;
import java.lang.*;
import java.math.*;
import java.math.*;



class brand_data{
	int id;
	String brand,prod;
	brand_data(int id,String brand,String prod)
	{
		this.id=id;
		this.brand=brand;
		this.prod=prod;
	}
	void display()
	{
		{
			System.out.println("Product id = "+id+"\nBrand = "+brand+"\nProduct = "+prod);
		}
	} 
}//End of branddata class

public class brand{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		int number=0;
		int i,id,count=0,count1=0;
		String brand;
		String prod;
		brand_data []c= new brand_data[10];
		while(true){
				System.out.println("\n You can perform the following tasks: \n 1.Add Entry \n 2.Display Entry \n 3.Exit");
				System.out.print("Enter your choice ");
				choice = sc.nextInt();	
				switch(choice){
					case 1:
							System.out.print("Enter the number of entries you want to make: ");
							number=sc.nextInt();
							for(i=0;i<number;i++){
									id=++count;
								System.out.print("Enter the brand name :");
								brand=sc.next();	
								System.out.print("Enter the product name :");
								prod=sc.next();
								c[i]=new brand_data(id,brand,prod);
							}//End of for loop							
							break;
					case 2:
							for(i=0;i<number;i++){
								if(c[i].brand.equals("Samsung") || c[i].brand.equals("samsung")){
									c[i].display();
									count1++;
								}
							}
							System.out.println(count1+" Customers have brought Samsung product ");	
							break;
					case 3:
							System.exit(0);
							break;
					default:
							System.out.println("Invalid Choice");
							break;
							}	//End of switch case
				}	//End of while loop 		
			
	}//End of main function 
}//End of complex class

/*
universe@dell15:~/Desktop/8604$ javac brand.java
universe@dell15:~/Desktop/8604$ java brand

 You can perform the following tasks: 
 1.Add Entry 
 2.Display Entry 
 3.Exit
Enter your choice 1
Enter the number of entries you want to make: 2
Enter the brand name :Samsung
Enter the product name :mobile
Enter the brand name :samsung
Enter the product name :mobile

 You can perform the following tasks: 
 1.Add Entry 
 2.Display Entry 
 3.Exit
Enter your choice 2
Product id = 1
Brand = Samsung
Product = mobile
Product id = 2
Brand = samsung
Product = mobile
2 Customers have brought Samsung product 

 You can perform the following tasks: 
 1.Add Entry 
 2.Display Entry 
 3.Exit
Enter your choice 3

*/
