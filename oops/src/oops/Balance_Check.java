package oops;

import java.util.Scanner;

public class Balance_Check {
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        int minimum_balance = 5000;
        if (balance >= (amount + minimum_balance)) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient Balance");
            return 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Balance_Check acc = new Balance_Check();  // 👈 object of updated class name

        while (true) {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    System.out.println("Amount deposited successfully.");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    double withdrawn = acc.withdraw(wd);
                    if (withdrawn != 0.0)
                        System.out.println("Withdrawn: ₹" + withdrawn);
                    break;

                case 3:
                    System.out.println("Current Balance: ₹" + acc.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
