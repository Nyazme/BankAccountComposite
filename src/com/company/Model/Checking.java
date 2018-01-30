package com.company.Model;

public class Checking extends BankAccount {
    public double overDraftFee = 25;
    public Checking(double balance) {
        super(balance);
    }//constructor

    @Override
    public void withdraw (double value){
      if (value>=this.balance){
          this.balance -= value;
          this.balance -= overDraftFee;
          System.out.println("Overdraft fee of " + overDraftFee + "applied!");

      } //end of value >= balance
else{
     this.balance-= value;
      }



    }

}