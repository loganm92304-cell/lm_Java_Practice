public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id,
                   Customer customer,
                   double amount) {

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public double getAmountAfterDiscount() {

        return amount -
                (amount * customer.getDiscount() / 100);
    }

    public String toString() {

        return "Invoice[id="
                + id
                + ",customer="
                + customer
                + ",amount="
                + amount
                + "]";
    }
}