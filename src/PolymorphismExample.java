class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says Meow");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says Woof");
    }

    // Method Overloading (compile-time polymorphism)
    void makeSound(String mood) {
        System.out.println("Dog barks when it's " + mood);
    }

    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.makeSound();
        a2.makeSound();

        Dog d = new Dog();
        d.makeSound("angry");
    }
}
