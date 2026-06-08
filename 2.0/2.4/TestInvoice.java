public class TestInvoice {

    public static void main(String[] args) {

        // Create invoices
        Invoice inv1 = new Invoice("I101", "Keyboard", 2, 45.50);
        Invoice inv2 = new Invoice("I102", "Mouse", 3, 20.00);
        Invoice inv3 = new Invoice("I103", "Monitor", 1, 250.00);

        // Copy invoice
        Invoice inv4 = new Invoice(inv1);

        // Print invoices
        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);
        System.out.println(inv4);

        // Print invoice count
        System.out.println();
        System.out.println("Total invoices created: "
                + Invoice.invoiceCount);
    }
}