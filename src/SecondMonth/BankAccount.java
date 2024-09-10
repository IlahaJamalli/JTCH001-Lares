package SecondMonth;

public class BankAccount {

    static int totalAccounts;

    public BankAccount() {
        totalAccounts++;

    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        BankAccount b=new BankAccount();
        BankAccount c=new BankAccount();
        BankAccount d=new BankAccount();
        BankAccount k=new BankAccount();

        System.out.println(BankAccount.getTotalAccounts());

    }

}
