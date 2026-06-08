public class Circle {

    private double radius;

    // static final constant
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}