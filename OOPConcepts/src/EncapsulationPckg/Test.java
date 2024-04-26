
package EncapsulationPckg;

public class Test {
    public static void main(String[] args){
            
            Student s169925;
            s169925 = new Student();
    
            //set method for student
            s169925.setStudName("Ryan");
            s169925.setStudResidence("London");
            
            System.out.println("My name is " + s169925.getStudName()+ " and I live in " + s169925.getStudResidence() );
            
            
           
    }
            
    
}
