package Family;

public class Test {

  public static void main(String[] args) {
    Parent myParent;
    myParent = new Child("Regina Cavaleri", 40, "Monalisa");

    myParent.setName("Regina Cavaleri");

    System.out.println("Parent's name: " + myParent.getName());
    System.out.println("Parent's age: " + myParent.getAge());
    myParent.introduce();
  }
}
