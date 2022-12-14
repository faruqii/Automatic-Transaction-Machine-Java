package com.app.banking.domain;

public class CheckingAccount extends Account {

    private double overdraftException;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftException = protect;
    }

    @Override
    public void withdraw(double amt) throws OverdraftException {
        // TODO Auto-generated method stub
        super.withdraw(amt);
    }


}
