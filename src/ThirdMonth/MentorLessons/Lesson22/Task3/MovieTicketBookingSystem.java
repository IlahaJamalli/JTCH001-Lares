package ThirdMonth.MentorLessons.Lesson22.Task3;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Booking booking = new Booking(1, 3);
        booking.addConcessionItem(ConcessionItem.POPCORN);
        booking.addTicket(new Ticket(MovieType.HORROR, SeatType.VIP));
        booking.displayInfo();
    }
}
