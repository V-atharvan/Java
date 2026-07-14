abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
        System.out.println("Dog bits");
    }
}





public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}