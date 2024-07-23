package aula82.entities;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public void deposit(double value) {
        accountBalance += value;
    }

    public void withdraw(double value){
        accountBalance -= value + 5.0;
    }

    @Override
    public String toString() {
        return "Account: " +
                accountNumber +
                ", Holder: " +
                accountHolder +
                ", Balance: $" +
                String.format("%.2f", accountBalance);
    }
}
