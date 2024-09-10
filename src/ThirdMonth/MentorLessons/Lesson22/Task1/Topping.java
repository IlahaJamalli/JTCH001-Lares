package ThirdMonth.MentorLessons.Lesson22.Task1;

public enum Topping {
    CHEESE(2),
    TOMATO(1),
    OLIVES(1.5),
    MUSHROOMS(3);

    double toppingPrice;

    Topping(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }
}
