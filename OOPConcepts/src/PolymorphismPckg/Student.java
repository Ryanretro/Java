
package PolymorphismPckg;

public class Student {
    
    //method override
    public void greet(){
        System.out.println("Hello there");
        System.out.println("I am so powerful do not devalue me");
        
    }
    
    //another overloaded method
    public void greet(String name, String myName){
        System.out.println( "Hello there  "+name+"  My name is   "+myName);        
    }
    
    
}
