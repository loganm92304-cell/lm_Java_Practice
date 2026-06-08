public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);

        System.out.println("Area 1: " + c1.getArea());
        System.out.println("Area 2: " + c2.getArea());

        // Try changing PI
        // Circle.PI = 22/7;

        // ERROR:
        // Cannot assign a value to final variable PI
    }
}