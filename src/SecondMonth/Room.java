package SecondMonth;

public class Room {

    int roomNumber;
    String type;
    boolean isBooked;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
    }

    public Room(int roomNumber, String type, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = isBooked;
    }

    public int getRoomNumber() {

        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {

        this.roomNumber = roomNumber;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {

        isBooked = booked;
    }

    public void displayInformation(){
        System.out.println(roomNumber);
        System.out.println(type);
        System.out.println(isBooked);
    }

}
