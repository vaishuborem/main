// Abstract class Shape
abstract class Shape {
    int dim1, dim2;

    // Constructor to initialize dimensions
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to print the area
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void printArea() {
        System.out.println("Rectangle Area: " + (dim1 * dim2));
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    public void printArea() {
        System.out.println("Triangle Area: " + (0.5 * dim1 * dim2));
    }
}

// Circle class extending Shape
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    public void printArea() {
        System.out.println("Circle Area: " + (3.14 * dim1 * dim1));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape triangle = new Triangle(10, 15);
        Shape circle = new Circle(7);

        rectangle.printArea(); // Rectangle Area: 200
        triangle.printArea(); // Triangle Area: 75.0
        circle.printArea(); // Circle Area: 153.86
    }
}
