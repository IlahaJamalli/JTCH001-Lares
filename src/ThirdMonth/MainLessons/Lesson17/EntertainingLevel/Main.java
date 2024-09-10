package ThirdMonth.MainLessons.Lesson17.EntertainingLevel;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("34", "Ilahe", 70);
        BankAccount bankAccount2=new BankAccount("43", "Ilo", 100);

        try {
            bankAccount1.transferFunds(bankAccount1, 9);
            bankAccount2.transferFunds(bankAccount2,98);

        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        bankAccount1.displayInfo();
        bankAccount2.displayInfo();

    }
}
