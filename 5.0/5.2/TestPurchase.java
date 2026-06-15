public class TestPurchase {

    public static void main(String[] args) {

        WeighedItem banana =
                new WeighedItem("Banana", 3.0, 1.37);

        CountedItem pens =
                new CountedItem("Pens", 4.5, 10);

        System.out.println(banana);
        System.out.println(pens);
    }
}