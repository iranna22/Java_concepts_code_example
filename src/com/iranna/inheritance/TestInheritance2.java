package com.iranna.inheritance;

//Hierarchical Inheritance Example
class A{  
void eat(){System.out.println("eating...");}  
}  
class D extends A{  
void bark(){System.out.println("barking...");}  
}  
class C extends A{  
void meow(){System.out.println("meowing...");}  
}  
public class TestInheritance2{  
public static void main(String args[]){  
C c=new C();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  