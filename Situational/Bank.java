package Situational;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Bank {
    private String bankName;
    private List<BankAccount> listOfAccount;

    public Bank(String bankName){
        this.bankName=bankName;
        this.listOfAccount=new ArrayList<>();
    }
    public void addAccount(BankAccount account){
        listOfAccount.add(account);
        System.out.println("bank account added successfully");
    }
    public void displayAllAccount(){
        System.out.println("Bank name :" + bankName);
        for(BankAccount account:listOfAccount){
            account.displayAccountDetails();
            account.displayAccountType();
            System.out.println();

        }
    }
    public void performTransaction(int accountNumber,String transactionType,double amount){
        for(BankAccount account:listOfAccount){
            if (account.getAccountNumber() == accountNumber) {
                
            }


        }

    }




    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<BankAccount> getListOfAccount() {
        return listOfAccount;
    }

    public void setListOfAccount(List<BankAccount> listOfAccount) {
        this.listOfAccount = listOfAccount;
    }
}
