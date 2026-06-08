public class MyPoint {

    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // distance with coordinates
    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;

        return Math.sqrt(xDiff * xDiff
                + yDiff * yDiff);
    }

    // distance with another point
    public double distance(MyPoint another) {

        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;

        return Math.sqrt(xDiff * xDiff
                + yDiff * yDiff);
    }

    // distance from origin
    public double distance() {
        return distance(0, 0);
    }
}