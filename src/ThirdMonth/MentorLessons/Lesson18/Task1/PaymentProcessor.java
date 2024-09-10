package ThirdMonth.MentorLessons.Lesson18.Task1;

public class PaymentProcessor {
    public void processPayment(double amount) throws PaymentProcessingException {

        if(amount<0){
            throw new PaymentProcessingException("Invalid amount");
        }
        System.out.println("Payment of " + amount + " processed successfully.");

    }
}
