public class Invoice {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Static variable
    public static int invoiceCount = 0;

    // Constructor
    public Invoice(String id, String desc,
                   int qty, double unitPrice) {

        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;

        invoiceCount++;
    }

    // Copy constructor
    public Invoice(Invoice other) {
        this.id = other.id;
        this.desc = other.desc;
        this.qty = other.qty;
        this.unitPrice = other.unitPrice;

        invoiceCount++;
    }

    // Get total
    public double getTotal() {
        return qty * unitPrice;
    }

    // toString method
    @Override
    public String toString() {
        return "Invoice[id=" + id +
                ", desc=" + desc +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                ", total=" + getTotal() + "]";
    }
}