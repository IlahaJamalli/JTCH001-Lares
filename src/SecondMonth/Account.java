package SecondMonth;

public class Account {

    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
      this.accountNumber=accountNumber;
      this.balance=balance;
    }

    public void deposit(double amount){
        balance+=amount;
//        System.out.println("Added " + amount);
//        System.out.println("New balance: "+ balance);
    }
    public void cashDraw(double amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println("Cashdraw " + amount);
        } else{
            System.out.println("There is not enough money in the balance");
        }
        System.out.println("Updated balance: "+balance);

    }

    public static void main(String[] args) {
    Account bankAccount=new Account("111111", 1000.0);
    bankAccount.deposit(500);
    bankAccount.cashDraw(400);
    }

}
