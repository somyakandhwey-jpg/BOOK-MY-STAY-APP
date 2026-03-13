/**
 * UseCase3InventorySetup
 *
 * Demonstrates centralized room inventory management
 * using HashMap in the Book My Stay Hotel Booking System.
 *
 * @author Student
 * @version 3.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory class manages room availability
 * using a centralized HashMap.
 */
class RoomInventory {

    // HashMap storing room type -> available count
    private HashMap<String, Integer> inventory;

    // Constructor initializes the inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register room types with initial availability
        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Retrieve availability for a specific room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Update room availability
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    // Display current inventory
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " -> Available: " + entry.getValue());
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
        System.out.println("Hotel Booking System v3.0");
        System.out.println("=======================================");

        // Initialize centralized inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Example availability lookup
        System.out.println("\nChecking availability for Single Room...");
        int available = inventory.getAvailability("Single Room");
        System.out.println("Available Single Rooms: " + available);

        // Example update operation
        System.out.println("\nUpdating availability for Single Room...");
        inventory.updateAvailability("Single Room", 4);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nInventory management demonstration completed.");
    }
}
