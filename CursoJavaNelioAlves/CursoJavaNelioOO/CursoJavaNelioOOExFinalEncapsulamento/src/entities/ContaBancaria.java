package entities;

public class ContaBancaria {

    private int accountNumber;
    private String name;
    private double balance;

    public ContaBancaria(int accountNumber, String name, double deposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        depositBalance(deposit);
    }

    public ContaBancaria(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositBalance(double valorDoDeposito) {
        this.balance += valorDoDeposito;
    }

    public void withdrawBalance(double valorDoSaque) {
        this.balance -= valorDoSaque + 5.00;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f\n", getAccountNumber(), getName(), getBalance());
    }
}
