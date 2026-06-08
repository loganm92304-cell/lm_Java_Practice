public class TestRectangle {

    public static void main(String[] args) {

        // Creating Rectangle objects
        Rectangle rect1 = new Rectangle(5, 3);
        Rectangle rect2 = new Rectangle(10, 4);

        // Display results
        System.out.println("Rectangle 1");
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}