
package Family;

public abstract class Parent {

  private String name;
  private int age;

  public Parent(String name, int age, String monalisa) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public abstract void introduce();
}
