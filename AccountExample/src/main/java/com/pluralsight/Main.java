package com.pluralsight;

public class Main {
    public static void main(String[] args) {



        BankAccount acc1 = new BankAccount("12", "tony", 5000);
        BankAccount acc2 = new BankAccount("12", "tony", 5000);
        BankAccount acc3 = new BankAccount("12", "tony", 5000);
        BankAccount acc4 = new BankAccount("12", "tony", 5000);
        BankAccount acc5 = new BankAccount("12", "tony", 5000);
        BankAccount acc6 = new BankAccount("12", "tony", 5000);
        BankAccount acc7 = new BankAccount("12", "tony", 5000);


        acc1.withdraw(300);
        acc1.deposit(15);

        acc2.withdraw(300);
        acc2.deposit(25);
        BankAccount.getInterestRate();

        acc3.withdraw(300);

        acc4.withdraw(300);
        acc5.withdraw(300);
        acc6.withdraw(300);
        acc7.withdraw(300);





    }
}