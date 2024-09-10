package ThirdMonth.MentorLessons.Lesson19;

public class LetterPrinter implements Runnable {

    @Override
    public void run() {
        char[] letter={'A', 'B', 'C', 'D', 'E'};
        try {
            for (int i = 0; i < letter.length; i++) {
                System.out.print(letter[i] + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
