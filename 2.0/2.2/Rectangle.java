public class Rectangle {

    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }
}