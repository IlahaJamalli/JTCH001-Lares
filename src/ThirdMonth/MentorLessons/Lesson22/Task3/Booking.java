package ThirdMonth.MentorLessons.Lesson22.Task3;

public class Booking {
    Ticket[] tickets;
    int ticketCount;
    ConcessionItem[] concessionItems;
    int itemCount;

    public Booking(int ticketCount, int itemCount) {
        this.tickets = new Ticket[ticketCount];
        this.ticketCount = 0;
        this.concessionItems = new ConcessionItem[itemCount];
        this.itemCount = 0;
    }

    public void addTicket(Ticket ticket){
        for (int i = 0; i < tickets.length; i++) {
            if(ticketCount <tickets.length){
                tickets[ticketCount]=ticket;
                ticketCount++;
            }
        }
    }
    public void addConcessionItem(ConcessionItem concessionItem){
        for (int i = 0; i < itemCount; i++) {
            if (itemCount<concessionItems.length){
                concessionItems[itemCount]=concessionItem;
                itemCount++;
            }
        }
    }
    public int calculatePrice(){
        int totalPrice=0;
        for (int i = 0; i < ticketCount; i++) {
            totalPrice+=tickets[i].calculate();
        }
        for (int i = 0; i < itemCount; i++) {
            totalPrice+=concessionItems[i].getFoodPrice();
        }
        return totalPrice;
    }
    public void displayInfo(){
        for (int i = 0; i < ticketCount; i++) {
            System.out.println("Tickets: "+tickets[i]);
        }
        for (int i = 0; i <itemCount ; i++) {
            System.out.println("Concession: " + concessionItems[i]);
        }
        System.out.println("Total price: "+ calculatePrice());
    }


}
