interface Shape {
    double calculateArea();
}

abstract class AbstractShape implements Shape {
    protected double area;

    public AbstractShape() {
        initialize();
        calculateArea();
    }

    public abstract void initialize();

    public void displayDetails() {
        System.out.println("Shape Details:");
        System.out.println("Area: " + area);
    }
}

class Circle extends AbstractShape {
    private double radius;

    @Override
    public void initialize() {
        System.out.println("Initializing Circle...");
        radius = 5.0; 
    }

    @Override
    public double calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

class Rectangle extends AbstractShape {
    private double length;
    private double width;

    @Override
    public void initialize() {
        System.out.println("Initializing Rectangle...");
        length = 4.0; 
        width = 3.0;  
    }

    @Override
    public double calculateArea() {
        area = length * width;
        return area;
    }
}

public class ShapeManagement {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.displayDetails();

        rectangle.displayDetails();
    }
}