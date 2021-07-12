package day8.exercise4;

public class BankAccount {
    public String owner;
    public int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdrawal(int amount) {
        this.balance -= amount;
    }
}
