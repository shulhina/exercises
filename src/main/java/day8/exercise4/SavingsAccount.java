package day8.exercise4;

public class SavingsAccount extends BankAccount {
    public int annualInterestRate;

    public void depositMonthlyInterest() {
        balance += balance * (annualInterestRate / 100);
    }
}
