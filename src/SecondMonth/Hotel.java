package SecondMonth;
import java.util.Scanner;

public class Hotel {

    Room[] rooms;
    int roomCount;

    public Hotel(int size) {
        rooms=new Room[size];
        roomCount=0;
    }
    
    public void addRoom(int roomNumber, String type, boolean isBooked){
        Room room = new Room(roomNumber, type, isBooked);
        rooms[0] = room;

        if(roomCount<rooms.length) {
            roomCount++;
            System.out.println("Room added");
        }else{
            System.out.println("Hotel is full");
        }

}
    public Room findRoom(int roomNumber){
        for(int i=0; i<roomCount; i++){
            if(rooms[i].getRoomNumber()==roomNumber){
                return rooms[i];
            }
        }
        return null;
    }
public void bookRoom(int roomNumber){
        Room room= findRoom(roomNumber);
        if(room != null && !room.isBooked()){
            room.setBooked(true);
            System.out.println("Room booked.");
        } else {
            System.out.println("Room not found or already booked.");
        }
}
    public void cancelRoom(int roomNumber){
        Room room= findRoom(roomNumber);
        if(room != null && room.isBooked()){
            room.setBooked(false);
            System.out.println("Booking canceled.");
        } else {
            System.out.println("Room not found or already available.");
        }
    }
    public void listRooms(){
        for (int i = 0; i < roomCount; i++) {
            rooms[i].displayInformation();
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Hotel hotel = new Hotel(1);

            while (true) {
                System.out.println();
                System.out.println("Choose an option: ");
                System.out.println("1 for adding Room");
                System.out.println("2 for booking Room");
                System.out.println("3 for cancel Booking");
                System.out.println("4 for listing all Rooms");
                System.out.println("5 for exiting");
                System.out.print("Your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter room type: ");
                    scanner.nextLine();
                    String type = scanner.nextLine();
                    hotel.addRoom(roomNumber, type, true);

                } else if (choice == 2) {
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    hotel.bookRoom(roomNumber);

                } else if (choice == 3) {
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    hotel.cancelRoom(roomNumber);

                } else if (choice == 4) {
                    hotel.listRooms();

                } else if (choice == 5) {
                    System.out.println("You exit");
                    return;

                }
            }
        }
    }


