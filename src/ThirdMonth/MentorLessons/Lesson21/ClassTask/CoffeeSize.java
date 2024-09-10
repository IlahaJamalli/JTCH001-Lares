package ThirdMonth.MentorLessons.Lesson21.ClassTask;

public enum CoffeeSize {
    SMALL(1),
    MEDIUM(1.2),
    LARGE(1.7);

   private double value;

    CoffeeSize(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
