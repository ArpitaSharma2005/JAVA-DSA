package com.example.bank;

public class Application {
    public static void main(String[] args) {
        SavingAccount myAccount = new SavingAccount(500); // Starting with ₹500

        myAccount.deposit(200);     // Balance: ₹700
        myAccount.withdraw(650);    // ❌ Not allowed, would go below ₹100
        myAccount.withdraw(500);    // ✅ Allowed, balance = ₹200
        System.out.println("Final Balance: ₹" + myAccount.getBalance());
    }
}
