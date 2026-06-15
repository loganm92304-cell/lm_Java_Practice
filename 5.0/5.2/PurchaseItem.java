public class PurchaseItem {

    private String name;
    private double unitPrice;

    public PurchaseItem() {
        this("no item", 0.0);
    }

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return name + " @ " + unitPrice;
    }
}