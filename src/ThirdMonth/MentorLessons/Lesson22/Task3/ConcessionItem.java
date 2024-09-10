package ThirdMonth.MentorLessons.Lesson22.Task3;

public enum ConcessionItem {
    POPCORN(6),
    SODA(2),
    CANDY(4);

    int foodPrice;

    ConcessionItem(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodPrice() {
        return foodPrice;
    }
}
