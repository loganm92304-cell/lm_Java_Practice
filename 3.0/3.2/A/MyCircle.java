public class MyCircle {

    private MyPoint center;
    private int radius;

    // Constructor
    public MyCircle(int x, int y, int radius) {

        center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Overloaded constructor
    public MyCircle(MyPoint center, int radius) {

        this.center = center;
        this.radius = radius;
    }

    // Default constructor
    public MyCircle() {

        center = new MyPoint(0, 0);
        radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {

        return center.distance(another.center);
    }

    public String toString() {

        return "MyCircle[radius="
                + radius
                + ",center="
                + center
                + "]";
    }
}