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
    public int insufficientFundsFee;

    public void processCheck() {

    }
}

class SavingsAccount extends BankAccount {
    public int annualInterestRate;

    public void depositMonthlyInterest() {
        balance += balance * (annualInterestRate / 100);
    }
}