/*
Samyak Gaur(8604)
Batch B
write a program to implement inheritance in java 
*/
class Box {
	double width;
	double height;
	double depth;
	Box() {	
		//width=height=depth = 15;
		System.out.println("Default constructor of Box i.e parent class");
	}//end of default constructor 
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		System.out.println("Parmeterized constructor of Box i.e parent class");
	}//End of parameterized constructor
	double getVolume() {
		return(width * height * depth);
	}//Function to calculate volume 
}//End of parent class
class MatchBox extends Box {
	double weight;
	MatchBox() {
		//super(); //automatically inserted by JVM implicitly 
		//weight = 10;
		System.out.println("Default constructor of MatchBox i.e child class");
	}//end of default constructor callled imlicitly
	MatchBox(double w, double h, double d, double m) {
		//super(); //automatically inserted by JVM implicitly 
		width = w;
		height = h;
		depth = d;
		weight = m;
		//super(w,b,h);
		System.out.println("Parameterized constructor of MatchBox i.e child class");
	}//End of paramterized constructor 
}//End of child class extending class box
public class inherit{
	public static void main(String args[]){
		MatchBox mb = new MatchBox(); //just to illustrate default constructor
		MatchBox mb1 = new MatchBox(10, 10, 10, 10);
		System.out.println("volume is: "+ mb1.getVolume());
		System.out.println("width of MatchBox 1 is: " + mb1.width);
		System.out.println("height of MatchBox 1 is: " + mb1.height);
		System.out.println("depth of MatchBox 1 is: " + mb1.depth);
		System.out.println("weight of MatchBox 1 is: " + mb1.weight);
	}//End of main function 
}//end of class inherit containing main function 

/*
Output of the folllowing code is:
universe@dell15:~/Desktop/8604$ java inherit 
Default constructor of Box i.e parent class
Default constructor of MatchBox i.e child class
Default constructor of Box i.e parent class
Parameterized constructor of MatchBox i.e child class
volume is: 1000.0
width of MatchBox 1 is: 10.0
height of MatchBox 1 is: 10.0
depth of MatchBox 1 is: 10.0


*/
