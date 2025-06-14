class Animal {
    String name;
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
 void sound() {
        System.out.println("Generic animal sound");
    }
}


class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

public static void main(String[] args) {
    Cat c= new Cat();
    c.sound();

}
}
