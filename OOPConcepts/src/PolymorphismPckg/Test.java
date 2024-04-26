
package PolymorphismPckg;

public class Test {
    
    public static void main(String[] args){
     
        Student s = new Student();
        Studentcouncil sc = new Studentcouncil();
        
        s.greet();
        sc.greet();
        sc.greet(  "Imagine",   "Secular");
    }
    
}
