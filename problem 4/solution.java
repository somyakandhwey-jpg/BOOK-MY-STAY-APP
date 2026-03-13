/**
 * UseCase3InventorySetup
 *
 * Demonstrates centralized room inventory management
 * using HashMap in the Book My Stay Hotel Booking System.
 *
 * @author Student
 * @version 3.1
 */

import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory class manages all room availability.
 * It acts as the single source of truth for inventory data.
 */
class RoomInventory {

    // Centralized inventory structure
    private HashMap<String, Integer> roomAvailability;

    /**
     * Constructor initializes room types and availability.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();

        // Register room types with availability
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    /**
     * Retrieves availability for a given room type.
     */
    public int getAvailability(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }

    /**
     * Updates availability for a specific room type.
     */
    public void updateAvailability(String roomType, int newCount) {
        roomAvailability.put(roomType, newCount);
    }

    /**
     * Displays the complete inventory state.
     */
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");

        for (Map.Entry<String, Integer> entry : roomAvailability.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}

/**
 * Application Entry Point
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("Welcome to Book My Stay App");
        System.out.println("Hotel Booking System v3.1");
        System.out.println("=======================================");

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Retrieve availability
        System.out.println("\nChecking availability for Double Room...");
        int available = inventory.getAvailability("Double Room");
        System.out.println("Available Double Rooms: " + available);

        // Update availability
        System.out.println("\nUpdating availability for Double Room...");
        inventory.updateAvailability("Double Room", 2);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nProgram execution completed.");
    }
}
