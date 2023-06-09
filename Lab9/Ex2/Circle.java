package Ex2;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super("Circle");
        setRadius(0);
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius>0)
            this.radius = radius;
        else
            this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI*getRadius()*getRadius();
    }

    public double perimeter() {
        return 2*Math.PI*getRadius();
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}

