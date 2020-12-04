package day_35_CustomClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public int accountNumber;
    public double availableBalance;

    public void NewCustomer(String name, int accNum){

        accountName = name;
        accountNumber = accNum;

    }

    public void setInfo(String name, int accNum, double balance){

        accountName = name;
        accountNumber = accNum;
        availableBalance = balance;

    }

    public void getInfo(){
        System.out.println("=================================");
        System.out.println("Name on Account: "+accountName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: $"+availableBalance);
        System.out.println("=================================");
    }

    public void deposit(double depositAmount){
       double newBalance = availableBalance + depositAmount;
       availableBalance = newBalance;
        System.out.println("New balance: $"+newBalance);
    }

    public void withdraw(double WithdrawAmount){
        double newBalance = availableBalance - WithdrawAmount;
        availableBalance = newBalance;
        System.out.println("New balance: $"+newBalance);
    }

    public void showBalance(){
        System.out.println("As of today "+ LocalDate.now()+" your available balance is: $" + availableBalance);
    }

}
/*
  3. BankAccount
            Attributes:
                accountName, accountNumber, availableBalance
            Actions:
                setInfo: sets accountName, accountNumber,
                getInfo:
                deposit:
                wihtdraw:
                showBalance:
 */