package ThirdMonth.MentorLessons.Lesson19;

public class MultiThreadExample {

    public static void main(String[] args) {
      NumberPrinter numberPrinter=new NumberPrinter();
      LetterPrinter letterPrinter=new LetterPrinter();
      numberPrinter.start();

      Thread numberThread=new Thread(numberPrinter);
      Thread letterThread=new Thread(letterPrinter);

      numberThread.start();
      letterThread.start();

    }
}
