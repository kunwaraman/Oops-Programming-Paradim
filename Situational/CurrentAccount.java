package Situational;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;
    public CurrentAccount(int accountNumber,String accountHolderName,double balance,double overdraftLimit){
        super(accountNumber,accountHolderName,balance);
        this.overdraftLimit=overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("this is current account");
    }

    @Override
    public void withDraw(double amount) {
        if(getBalance()+overdraftLimit>amount) {
            super.withDraw(amount);
        }else{
            System.out.println("withdrawl failed overdraft limit exceed");
        }
    }

}
