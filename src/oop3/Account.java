package oop3;

import java.util.Date;

class Account {
    int id;
    double balance;
    double annualInterestRate;
    Date date;

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        date = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        date = new Date();
    }

    double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }
    void withdraw(double amount){
        balance -= amount;
    }
    void deposit(double amount){
        balance += amount;
    }
    void printInfo(){
        System.out.printf("Account[id = %d, balance = %f, annualInterestRate = %.2f, date = %tc],%n", id,balance,annualInterestRate,date);
    }
}
