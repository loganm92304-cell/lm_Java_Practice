public class TestMyCircle {

    public static void main(String[] args) {

        MyCircle c1 = new MyCircle(1, 2, 5);

        MyPoint p = new MyPoint(4, 5);

        MyCircle c2 = new MyCircle(p, 10);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Area: "
                + c1.getArea());

        System.out.println("Circumference: "
                + c1.getCircumference());

        System.out.println("Distance: "
                + c1.distance(c2));
    }
}