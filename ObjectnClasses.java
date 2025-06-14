public class ObjectnClasses {
    String name;
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        ObjectnClasses a = new ObjectnClasses();
        a.name = "Dog";
        a.makeSound();
    }
}