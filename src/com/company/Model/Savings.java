package com.company.Model;

public class Savings extends BankAccount {

    public Savings(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double value){
        if (value <= this.balance){
            this.balance -= value;
        } else {
            System.out.println("Withdraw DECLINED: Withdraw Greater Than Account Balance.");
        }

    }





}
