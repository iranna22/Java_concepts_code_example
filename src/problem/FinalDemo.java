package problem;

class Bike{  
	final int speedlimit=90;
	final String color;//final blank variable
	//we can initialise final blank variable only in constructor
	public Bike() {
		color="Red";
		System.out.println(color);
	}
	  final void run(){
		  System.out.println("running");
		  }  
	}  
	   
final class Vehicle{//this class can't be inherited
	int wheels;
}
	class Honda extends Bike{  
		//can't override run() bcoz its final
	  // void run(){System.out.println("running safely with 100kmph");}
		void runIt() {
			// can't assign value to speedlimit bcoz its final
			//speedlimit = 100;
			System.out.println("run it");
		}
	  }  
	
	class FinalDemo{
		public static void main(String args[]){  
			   Honda honda= new Honda(); 
			   //but final method can be inherited
			   honda.run();  
			   }  
	}