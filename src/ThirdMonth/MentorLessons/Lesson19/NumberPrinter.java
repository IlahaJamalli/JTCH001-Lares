package ThirdMonth.MentorLessons.Lesson19;

public class NumberPrinter extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i+ " ");
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
