import java.util.*;

class HotelReservationSystem {
    static boolean[] rooms = new boolean[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n______HOTEL RESERVATION SYSTEM________");
            System.out.println("1.View Rooms");
            System.out.println("2.Book Room");
            System.out.println("3.Cancel Booking");
            System.out.println("4.Exit");
            System.out.print("Enter Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewRooms();
                    break;
                case 2:
                    bookRoom(sc);
                    break;
                case 3:
                    cancelRoom(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using our system");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    static void viewRooms() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Room" + (i + 1) + ":" + (rooms[i] ? "Booked" : "Available"));
        }
    }

    static void bookRoom(Scanner sc) {
        System.out.print("Enter room number to book(1-5):");
        int room = sc.nextInt() - 1;
        if (room >= 0 && room < 5) {
            if (!rooms[room]) {
                rooms[room] = true;
                System.out.println("Room Booked Successfully!");
            } else {
                System.out.println("Room Already Booked!");
            }
        } else {
            System.out.println("Invalid Room Number");
        }
    }

    static void cancelRoom(Scanner sc) {
        System.out.print("Enter room to cancel:");
        int room = sc.nextInt() - 1;
        if (room >= 0 && room < 5) {
            if (rooms[room]) {
                rooms[room] = false;
                System.out.println("Booking cancelled");

            } else {
                System.out.println("Room already empty");
            }
        }
    }
}
