package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class BankAccountTest {

    BankAccount bankAccount = new BankAccount();

    @Test(priority = 1)
    public void testAccount(){
       String account =  bankAccount.setAccount(123,"Usep",20.5);;
        System.out.println("Account No : " +bankAccount.acc_no);
        System.out.println("Name : "+bankAccount.name);
        System.out.println("=====================================");
        System.out.println("Amount : "+bankAccount.amount);
        System.out.println("=====================================");
        Assert.assertEquals(account,123+"Usep"+20.5);
    }
    @Test(priority = 2)
    public void testDeposit(){
    double deposit = bankAccount.deposit(30.5);
        System.out.println("=====================================");
        System.out.println("Total Amount : "+deposit);
        System.out.println("=====================================");
        Assert.assertEquals(bankAccount.amount,51);
    }

    @Test(priority = 3)
    public void testWithdraw(){
        double wd =  bankAccount.withdraw(20.5);
        System.out.println("=====================================");
        System.out.println("Amount : "+wd);
        Assert.assertEquals(bankAccount.amount,30.5);
    }

    @Test(priority = 4)
    public void testCheckBalance(){
        bankAccount.checkBalance();
        Assert.assertEquals(bankAccount.amount,30.5);
    }

    @Test(priority = 5)
    public void testDisplay(){
        bankAccount.display();
    }





}
