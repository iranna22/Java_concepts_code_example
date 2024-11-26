package problem;

public class Practice {

	public static void main(String[] args) {
		  //using for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==2){  
	            //breaking the loop  
	           // break;  
	        	continue;
	        }  
	       // System.out.println(i);  
	    }  
	    
	    int i=1;  
	    while(i<=10){  
	        if(i==5){  
	            //using break statement  
	            i++;  
	            //break;
	            continue;//it will break the loop  
	        }  
	       System.out.println(i);  
	        i++;  
	    }  
	}

}
