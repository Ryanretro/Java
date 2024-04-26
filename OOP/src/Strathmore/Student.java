package Strathmore;


public class Student {
    
    // attributes/data members/ variables
    public int studentId;
    private String studentName;
    public static String studentCourse;
    public static String lecturerName;
    
    
    
    
    //behaviours/methods/functions
    public Student(){
    
    }
    public void introduce (){
        System.out.println("Hi, My name is"+studentName);
    }
    public String askQuestion(){
        String question = "How is your life hard";
        return question;
    }
    public String ansQuestion(String q){
        String answer = "It's really hard because i have no money";
        return answer;
    }}
