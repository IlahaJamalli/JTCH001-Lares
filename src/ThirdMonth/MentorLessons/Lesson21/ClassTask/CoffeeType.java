package ThirdMonth.MentorLessons.Lesson21.ClassTask;

public enum CoffeeType {
    ESPRESSO(3),
    LATTE(5),
    CAPPUCCINO(8),
    AMERICANO(6);

    private int prize;

    CoffeeType(int prize) {
        this.prize = prize;
    }

    public int getPrize() {
        return prize;
    }
}
