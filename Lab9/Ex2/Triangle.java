package Ex2;

public class Triangle extends Shape{
    private double side1length;
    private double side2length;
    private double side3length;

    public Triangle() {
        super("Triangle");
        setSide1length(0);
        setSide2length(0);
        setSide3length(0);
    }

    public Triangle(double side1length, double side2length, double side3length) {
        super("Triangle");
        setSide1length(side1length);
        setSide2length(side2length);
        setSide3length(side3length);
    }

    public double getSide1length() {
        return side1length;
    }

    public void setSide1length(double side1length) {
        this.side1length = side1length;
    }

    public double getSide2length() {
        return side2length;
    }

    public void setSide2length(double side2length) {
        this.side2length = side2length;
    }

    public double getSide3length() {
        return side3length;
    }

    public void setSide3length(double side3length) {
        this.side3length = side3length;
    }

    @Override
    public String toString() {
        return "Shape type: " + type + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n";
    }

    //    @Override
    public double area() {
        double s;
        s = ((side1length + side2length + side3length)/2);
        Double tem = Math.sqrt(s*(s-side1length)*(s-side2length)*(s-side3length));
        return Double.parseDouble(String.format("%.2f", tem));
    }

//    @Override
    public double perimeter() {
        return side1length + side2length + side3length;
    }
}
