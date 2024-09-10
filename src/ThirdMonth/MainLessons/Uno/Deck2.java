package ThirdMonth.MainLessons.Uno;

import java.util.Random;

public class Deck2 extends Card {
    Random random = new Random();
    public Deck2(String reversedCard,String fourPlus, String colors, String value) {
        super(reversedCard, fourPlus, colors, value);
    }

    public Deck2() {
        super();
    }

    public void shuffle() {
        int i = 1;
        int t = 1;
        while (i <= 7) {
            int generate = random.nextInt(4);
            switch (generate) {
                case 0:
                    System.out.println(t++ + ") " + getReversedCard());
                    break;
                case 1:
                    System.out.println(t++ + ") " + getColors());
                    break;
                case 2:
                    System.out.println(t++ + ") " + getFourPlus());
                    break;
                case 3:
                    System.out.println(t++ + ") " + getValue());
                    break;
            }
            i++;
        }
    }
}
