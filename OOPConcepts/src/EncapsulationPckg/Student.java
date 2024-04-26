package EncapsulationPckg;

public class Student {
    public int studId;
    private String studName;
    private String studResidence;
    
    public void setStudName (String newStudName){
        studName = newStudName;
    }
    public String getStudName () {
        return this.studName;
    }
    public void setStudResidence (String newStudResidence) {
        studResidence = newStudResidence;
    }
    public String getStudResidence () {
        return this.studResidence;  
    }
    private void goHome(){
    }
    
}