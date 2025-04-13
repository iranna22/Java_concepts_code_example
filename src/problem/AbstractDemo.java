package problem;

//all the things an abstract class can conatin
abstract class Shape {
    // Abstract method
    abstract void draw();

    abstract void drawTwo();
    // Concrete method
    void display() {
        System.out.println("Displaying a shape.");
    }

    // Instance variable
    String color = "red";

    // Static variable
    static int shapeCount = 0;
    
    //final variable
    final String a = "fianl value";

    // Constructor
    Shape(String color) {
        this.color = color;
        shapeCount++;
    }

    // Static method
    static void showShapeCount() {
        System.out.println("Total shapes: " + shapeCount);
    }

    // Final method
    final void printColor() {
        System.out.println("Shape color: " + color);
    }

    // Nested class
    static class Helper {
        void assist() {
            System.out.println("Helper assisting with shapes.");
        }
    }
}

class Circle extends Shape {
    Circle(String color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

	@Override
	void drawTwo() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("blue");
       // Shape s = new Shape("red");
        circle.draw();
        circle.display();
        circle.printColor();
        Shape.showShapeCount();
        Shape.Helper helper = new Shape.Helper();
        helper.assist();
        System.out.println(circle.a);
    }
}
