package day8.ex4;

public class Ex4 {
    public static void main(String[] args) {

    }
}

class BankAccount {
    public String owner;
    public int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdrawal(int amount) {
        this.balance -= amount;
    }
}

class CheckingAccount extends BankAccount {

}

class SavingsAccount extends BankAccount {

}