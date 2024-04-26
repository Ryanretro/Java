
package InheritancePckg;

public class Student {
    
    //Attributes
    public int studId;
    public String studName;
    private String studCourse;
    
    
    //Methods
    public void setStudName (String newStudName){
        studName = newStudName;
    }
    public String getStudName () {
        return this.studName;
    }
    public void setStudCourse (String newStudCourse) {
        studCourse = newStudCourse;
    }
    public String getStudCourse () {
        return this.studCourse;  
    }
    public void introduce(){
        studName = "Kikuvi";
        studCourse = "DBIT";
        studId = 170839;
    }
    
}
