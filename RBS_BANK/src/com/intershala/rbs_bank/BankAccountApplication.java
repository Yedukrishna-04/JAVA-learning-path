package com.intershala.rbs_bank;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAccount rbsAccount = new BankAccount(101,10000);
         //rbsAccount.accountNumber = 101;
        //rbsAccount.balance = 10000;
        rbsAccount.deposit_amount(15000);
        rbsAccount.withdraw_amount(10000);
        rbsAccount.check_balance();
        System.out.println(rbsAccount.getBalance());

        BankAccount rbsAccount2 = new BankAccount(201,50000);
        rbsAccount2.withdraw_amount(5000);
    }
}
