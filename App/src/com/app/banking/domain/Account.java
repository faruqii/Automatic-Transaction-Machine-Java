package com.app.banking.domain;

public class Account {
    
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt <= balance) {
            balance -= amt;
        } else {
            // get the deficit from OverdraftException
            double deficit = amt - balance;
            throw new OverdraftException("Insufficient funds for overdraft protection", deficit);
        }
    }

    
}
