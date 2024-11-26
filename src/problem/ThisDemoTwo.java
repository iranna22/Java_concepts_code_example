package problem;


class ThisDemoTwo{  
	  void m(ThisDemoTwo obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	  public static void main(String args[]){  
		  ThisDemoTwo s1 = new ThisDemoTwo();  
	  s1.p();  
	  }  
	}  