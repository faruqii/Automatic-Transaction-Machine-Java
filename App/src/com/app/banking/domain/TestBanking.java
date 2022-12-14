package com.app.banking.domain;

public class TestBanking {
    
    public static void main(String[] args) {
        Account account = new Account(500.00);
        System.out.println("Depositing $500...");
        account.deposit(500.00);
        System.out.println("Withdrawing $100...");
        try {
            account.withdraw(100.00);
            System.out.println("Withdrawing $600...");
            account.withdraw(600.00);
        } catch (OverdraftException e) {
            System.out.println("Sorry, but you are short $" + e.getDeficit());
            e.printStackTrace();
        }

        CheckingAccount checkingAccount = new CheckingAccount(500.00);
        System.out.println("Depositing $500...");
        checkingAccount.deposit(500.00);
        System.out.println("Withdrawing $100...");
        try {
            checkingAccount.withdraw(100.00);
            System.out.println("Withdrawing $600...");
            checkingAccount.withdraw(600.00);
        } catch (OverdraftException e) {
            System.out.println("Sorry, but you are short $" + e.getDeficit());
            e.printStackTrace();
        }
    }
}
