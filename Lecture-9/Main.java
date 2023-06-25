
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Labrador extends Dog {
    public void play() {
        System.out.println("Labrador is playing.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); 
        labrador.bark(); 
        labrador.play(); 

        System.out.println();

        Cat cat = new Cat();
        cat.eat(); 
        cat.meow(); 
    }
}
