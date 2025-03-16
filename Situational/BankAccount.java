package Situational;
abstract class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }


    public void deposit(double amount){
        if(amount>=0){
            balance+=amount;
            System.out.println("deposit amount" + amount);
        }else{
            System.out.println("Invalid amount");
        }

    }
    public void withDraw(double amount){
        if(amount>=0 && balance>=amount){
            balance=balance-amount;
            System.out.println("withdraw successfull " + amount);
        }else{
            System.out.println("Insufficient amount");
        }
    }

    public void displayAccountDetails(){
        System.out.println("Account number " + accountNumber);
        System.out.println("Account holder name" + accountHolderName);
        System.out.println("Account balance " + balance);
    }
    public abstract void displayAccountType();




    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
