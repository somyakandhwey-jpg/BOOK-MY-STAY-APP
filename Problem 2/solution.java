/**
 * UseCase2RoomInitialization
 *
 * This program demonstrates basic room initialization for the
 * Book My Stay Hotel Booking Management System.
 * It introduces object-oriented concepts such as abstraction,
 * inheritance, encapsulation, and polymorphism.
 *
 * @author Student
 * @version 2.0
 */

abstract class Room {

    // Encapsulated attributes
    private String roomType;
    private int numberOfBeds;
    private int roomSize;
    private double pricePerNight;

    // Constructor
    public Room(String roomType, int numberOfBeds, int roomSize, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.roomSize = roomSize;
        this.pricePerNight = pricePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + roomSize + " sq ft");
        System.out.println("Price per Night: $" + pricePerNight);
    }
}

// Single Room class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 100.0);
    }
}

// Double Room class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 180.0);
    }
}

// Suite Room class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 500, 300.0);
    }
}

/**
 * Application Entry Point
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("Welcome to Book My Stay App");
        System.out.println("Hotel Booking System v2.0");
        System.out.println("=======================================");

        // Creating room objects (Polymorphism)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        // Display Single Room
        System.out.println("\n--- Single Room Details ---");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailability);

        // Display Double Room
        System.out.println("\n--- Double Room Details ---");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailability);

        // Display Suite Room
        System.out.println("\n--- Suite Room Details ---");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailability);

        System.out.println("\nApplication execution completed.");
    }
}
