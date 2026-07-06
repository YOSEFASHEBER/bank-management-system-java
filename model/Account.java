package model;

public class Account {

    private final int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, double balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account{" +
                "accountNumber=" + this.accountNumber +
                ", balance=" + this.balance +
                ",customer=" + this.customer +
                '}';
    }

}
