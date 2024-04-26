
package Polymorphism;

public class Parent {
    String name;
    protected int age;
    public String mood; 
    
    public Parent(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public void showLoveAndSupport() {
        System.out.println(name + "is showing love and support to their child.");
  }
  
    public void showAffection(String wayToShowAffection) {
        System.out.println(name + "age" + age + "is showing affection to their child by" + wayToShowAffection);
  }
  
    public void expressCare(String message, String action) {
        System.out.println(name + "age" + age + "expresses care by saying" + message + "and" + action);
    }
}


