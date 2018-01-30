package com.company.Model;

public class BankAccount {

 public double balance;
 public BankAccount(double balance){
     this.balance = balance;

 }
 public void withdraw(double value) {
        this.balance -= value;
    }
    public void deposit (double value) {
        this.balance -= value;
    }

}
