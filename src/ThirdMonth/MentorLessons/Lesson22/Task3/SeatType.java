package ThirdMonth.MentorLessons.Lesson22.Task3;

public enum SeatType {
    STANDARD(0),
    PREMIUM(3),
    VIP(5);

    int additionalPrice;

    SeatType(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public int getAdditionalPrice() {
        return additionalPrice;
    }
}
