package ThirdMonth.MentorLessons.Lesson22.Task3;

public enum MovieType {
    ACTION(7),
    COMEDY(8),
    DRAMA(6),
    HORROR(10),
    ANIMATION(5);
    int price;

    MovieType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
