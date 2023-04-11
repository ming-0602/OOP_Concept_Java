package Ex2;

public class Eclipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Eclipse() {
        super("Eclips");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Eclipse( double majorAxis, double minorAxis) {
        super("Eclips");
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public String toString() {
        return "Shape Type: " + type + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter();
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public double area() {
        double pie = 3.142;
        return (pie * (majorAxis) * (minorAxis));
    }

    @Override
    public double perimeter() {
        double pie = 3.142;
        double tem  = (Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2)/2);
        double tem2 = Math.sqrt(tem) * 2 * pie;
        return tem2;
    }
}
