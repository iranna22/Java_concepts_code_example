package problem;


public class OperatorsExample{  
public static void main(String args[]){  
int x=10;  
System.out.println("unary operators");
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
System.out.println("========================");
System.out.println("Arithmetic operators");
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0 
System.out.println("========================");
System.out.println("Assignment operators");
int a1=10; 
int b1 = 8;
a1+=b1;//10+3  
System.out.println(a1);  
a1-=4;//13-4  
System.out.println(a1);  
a1*=2;//9*2  
System.out.println(a1);  
a1/=2;//18/2  
System.out.println(a1);  
//b1=+2;
//System.out.println(b1);
}}  
