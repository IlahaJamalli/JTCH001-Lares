package ThirdMonth.MentorLessons.Lesson22.Task3;

public class Ticket {
    MovieType movieType;
    SeatType seatType;

    public Ticket(MovieType movieType, SeatType seatType) {
        this.movieType = movieType;
        this.seatType = seatType;
    }

    public int calculate(){
        return movieType.getPrice()+seatType.getAdditionalPrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieType=" + movieType +
                ", seatType=" + seatType +
                '}';
    }
}
