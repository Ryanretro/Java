
package InheritancePckg;

public class Test {
    
    public static void main(String[] args){
            
            Student student1 = new Student();
            //Student student2 = new StudentCouncil();
            StudentCouncil student3 = new StudentCouncil(170839,"Kikuvi", "DBIT", "President");
            
            student3.introduce();
    }
    }
    
