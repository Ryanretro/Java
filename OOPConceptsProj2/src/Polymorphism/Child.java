package Polymorphism;

public class Child extends Parent {

    private String favoriteToy;

    public Child(String name, int age, String favoriteToy) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public void playWithFavoriteToy() {
        System.out.println(name + "age" + age + "is playing with their favorite toy:" + favoriteToy);
    }
    
    @Override
    public void showLoveAndSupport() {
        System.out.println(name + "age" + age + "is giving a big hug to show love and support.");
    }
}
