package Situational;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Mybank");

        SavingAccount savingAccount = new SavingAccount(101,"aman",1000,5);
        CurrentAccount currentAccount = new CurrentAccount(102,"mohan",2300,8);

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        bank.displayAllAccount();

        bank.performTransaction(101,"deposit",500);
        bank.performTransaction(102,"withdraw",2500);

        savingAccount.calculateInterest();
        bank.displayAllAccount();

    }
}
