package oop3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);

        account.annualInterestRate = 4.5;
        account.printInfo();

        account.withdraw(2500);
        account.printInfo();

        account.deposit(3000);
        account.printInfo();

    }
}
