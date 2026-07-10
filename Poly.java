class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        // Polymorphism in action
        shape1.draw(); // Calls the draw method of Circle
        shape2.draw(); // Calls the draw method of Square
    }
}
