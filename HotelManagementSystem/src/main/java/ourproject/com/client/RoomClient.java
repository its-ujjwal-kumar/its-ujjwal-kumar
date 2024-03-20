package ourproject.com.client;


import java.util.Scanner;
import ourproject.com.model.Room;
import ourproject.com.service.RoomService;
import ourproject.com.serviceimpl.RoomServiceImpl;

public class RoomClient {
    private static final Scanner scanner = new Scanner(System.in);
    private static final RoomService roomService = new RoomServiceImpl();

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create Room");
            System.out.println("2. Read Room");
            System.out.println("3. Update Room");
            System.out.println("4. Delete Room");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    createRoom();
                    break;
                case 2:
                    readRoom();
                    break;
                case 3:
                    updateRoom();
                    break;
                case 4:
                    deleteRoom();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void createRoom() {
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter room type: ");
        String type = scanner.nextLine();
        System.out.print("Enter room price: ");
        String price = scanner.nextLine();
        
        Room room = new Room(roomNumber, type, price);
        roomService.createRoom(room);
        System.out.println("Room created successfully!");
        System.out.println("Inserted room details: " + room);
    }

    private static void readRoom() {
        System.out.print("Enter room number to read details: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        Room room = roomService.getRoom(roomNumber);
        if (room != null) {
            System.out.println("Room details:");
            System.out.println("Number: " + room.getRoomnumber());
            System.out.println("Type: " + room.getType());
            System.out.println("Price: " + room.getPrice());
        } else {
            System.out.println("Room with number " + roomNumber + " not found.");
        }
    }

    private static void updateRoom() {
        System.out.print("Enter room number to update details: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        Room existingRoom = roomService.getRoom(roomNumber);
        if (existingRoom != null) {
            System.out.println("Enter new details:");
            System.out.print("Type: ");
            String newType = scanner.nextLine();
            System.out.print("Price: ");
            String newPrice = scanner.nextLine();
            
            existingRoom.setType(newType);
            existingRoom.setPrice(newPrice);
            
            roomService.updateRoom(roomNumber, existingRoom);
            System.out.println("Room details updated successfully!");
        } else {
            System.out.println("Room with number " + roomNumber + " not found.");
        }
    }

    private static void deleteRoom() {
        System.out.print("Enter room number to delete: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        String result = roomService.deleteRoom(roomNumber);
        System.out.println(result);
    }
}

