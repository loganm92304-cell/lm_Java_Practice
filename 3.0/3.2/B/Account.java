public class Account {

    private int id;
    private Customer customer;
    private double balance;

    public Account(int id,
                   Customer customer,
                   double balance) {

        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        }
    }

    public String toString() {

        return "Account[id="
                + id
                + ",customer="
                + customer
                + ",balance="
                + balance
                + "]";
    }
}