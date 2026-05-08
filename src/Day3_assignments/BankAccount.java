package Day3_assignments;

import java.util.Scanner;

class BankAccount {

    private double balance = 1000;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance() {
        return balance;
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        b.deposit(d);

        System.out.print("Enter withdraw amount: ");
        double w = sc.nextDouble();
        b.withdraw(w);

        System.out.println("Balance: " + b.getBalance());

        sc.close();
    }
}