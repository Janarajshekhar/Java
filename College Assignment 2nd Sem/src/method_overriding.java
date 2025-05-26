// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overrides makeSound()
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class method_overriding{
    public static void main(String[] args) {
        Animal a = new Animal();  // Object of superclass
        Dog d = new Dog();        // Object of subclass

        a.makeSound();  // Calls Animal's method
        d.makeSound();  // Calls Dog's overridden method
    }
}
