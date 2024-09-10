package ThirdMonth.MentorLessons.Lesson22.Task1;

public enum PizzaSize {
    SMALL(0),
    MEDIUM(3),
    LARGE(5);

    private int price;

    PizzaSize(int price) {
      this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
