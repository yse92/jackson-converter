package solvd.models;

public class Account {
    private int id;
    private double balance;
    private boolean isActive;

    public Account() {
    }

    public Account(int id, double balance, boolean isActive) {
        this.id = id;
        this.balance = balance;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", isActive=" + isActive +
                '}';
    }
}
