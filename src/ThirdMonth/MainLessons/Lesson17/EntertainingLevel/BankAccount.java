package ThirdMonth.MainLessons.Lesson17.EntertainingLevel;

public class BankAccount {

    String accountNumber;
    String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount){
        balance+=amount;
        System.out.println("Deposited amount: " + amount );
        System.out.println("Balance: "+ balance);
    }
    public void withdrawAmount(double amount) throws InsufficientFundsException {

        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds!");
        }
    }

    public void displayInfo(){

        System.out.println("Balance: "+ getBalance());
        System.out.println("Account Holder: "+ getAccountHolder());
        System.out.println("Account Number: "+ getAccountNumber());

    }
    public void transferFunds(BankAccount newAccount, double amount) throws InsufficientFundsException {

        if(amount<=0){
            throw new InsufficientFundsException("Transfer amount must be positive.");
        }
        withdrawAmount(amount);
        newAccount.depositAmount(amount);
        System.out.println("Transfered succesfully");
    }


}
