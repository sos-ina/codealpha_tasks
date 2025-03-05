
package CodeAlpha;

import java.util.Scanner;

public class Hotel_Reservation_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalRooms = 5; 
        String[] roomTypes = {"Single", "Double", "Suite", "Single", "Double"}; 
        double[] roomPrices = {50, 80, 150, 50, 80}; 
        boolean[] isBooked = new boolean[totalRooms]; 
        String[] guestNames = new String[totalRooms]; 
        
        while (true) {
            System.out.println("\nHOTEL RESERVATION SYSTEM");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                System.out.println("\nAvailable Rooms:");
                for (int i = 0; i < totalRooms; i++) {
                    if (!isBooked[i]) {
                        System.out.println("Room " + (i + 1) + " (" + roomTypes[i] + ") - $" + roomPrices[i] + " per night");
                    }
                }
            } 
            else if (choice == 2) {
                System.out.print("\nEnter your name: ");
                String name = scanner.nextLine();
                
                System.out.print("Enter room number to book (1-" + totalRooms + "): ");
                int roomNumber = scanner.nextInt();
                
                if (roomNumber < 1 || roomNumber > totalRooms || isBooked[roomNumber - 1]) {
                    System.out.println("\nRoom is not available or invalid choice!");
                } else {
                    isBooked[roomNumber - 1] = true;
                    guestNames[roomNumber - 1] = name;
                    System.out.println("\nRoom " + roomNumber + " booked successfully for " + name + "!");
                }
            } 
            else if (choice == 3) {
                System.out.println("\nReservations:");
                boolean found = false;
                for (int i = 0; i < totalRooms; i++) {
                    if (isBooked[i]) {
                        System.out.println("Room " + (i + 1) + " (" + roomTypes[i] + ") - Guest: " + guestNames[i]);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No reservations found.");
                }
            } 
            else if (choice == 4) {
                System.out.println("Thank you for using the Hotel Reservation System!");
                break;
            } 
            else {
                System.out.println("Invalid choice! Try again.");
            }
        }
        
        scanner.close();
    }
}

