public class TestMyTriangle {

    public static void main(String[] args) {

        MyTriangle t1 =
                new MyTriangle(0, 0,
                               3, 0,
                               0, 4);

        System.out.println(t1);

        System.out.println("Perimeter: "
                + t1.getPerimeter());

        t1.printType();
    }
}