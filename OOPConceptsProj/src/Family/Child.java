
package Family;

public class Child extends Parent {

  private String childName;

  public Child(String name, int age, String childName) {
    super(name, age, "Monalisa");
    this.childName = childName;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I am " + getName() + " and I am a parent of " + childName);
  }

  public String getChildName() {
    return childName;
  }

  public void setChildName(String childName) {
    this.childName = childName;
  }
}
