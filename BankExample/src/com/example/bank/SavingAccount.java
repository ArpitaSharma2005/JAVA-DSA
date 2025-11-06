package com.example.bank;

public class SavingAccount extends BankAccount {

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance must stay above ₹100.");
        } else {
            super.withdraw(amount);
        }
    }
}
