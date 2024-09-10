package ThirdMonth.MentorLessons.Lesson22.Task1;

public enum PizzaType {

    MARGHERITA(25),
    PEPPERONI(20),
    VEGGIE(18),
    BBQ_CHICKEN(22);

    private int price;

    PizzaType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
