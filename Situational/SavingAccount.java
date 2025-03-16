package Situational;

public class SavingAccount extends BankAccount {
    private double InterestRate;
    private static  final  double Minimum_balance=100;

    public SavingAccount(int accountNumber,String accountHolderName,double balance,double InterestRate){
        super(accountNumber,accountHolderName,balance);
        this.InterestRate=InterestRate;
    }

    @Override
    public void withDraw(double amount) {
        if(getBalance()-amount >=Minimum_balance){
            super.withDraw(amount);
        }else{
            System.out.println("withdrawl failed");
        }
    }
    public void calculateInterest(){
        double interest = getBalance() * InterestRate/100;
        deposit(interest);
        System.out.println("Interest added" + interest);
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("this is saving account");

    }
}


