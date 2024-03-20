package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //Shape
        Shapes shape = new Shapes();

        shape.hello();


        //Circle
        Circle circle = new Circle();

        circle.hello();


        //Triangle
        Triangle triangle = new Triangle();
        triangle.hello();


        //Square
        Square square = new Square();
        square.hello();

    }
}
