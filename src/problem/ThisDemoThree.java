package problem;
//this: to pass as an argument in the method
class S2{  
	  void m(S2 obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	  
	}  

//this: to pass as argument in the constructor call
class B{  
	  A4 obj;  
	  
	  B(A4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  
	  
	class A4{  
	  int data=10;  
	  A4(){  
	   B b=new B(this);  
	   b.display();  
	  }  
	  }  
	
	
	public class ThisDemoThree{
		public static void main(String args[]){  
			  S2 s1 = new S2();  
			  s1.p();
			   A4 a=new A4();  

			  }  
	}