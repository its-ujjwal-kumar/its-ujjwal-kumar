package ourproject.com.client;


import java.util.Scanner;

public class MainController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Main Menu:");
            System.out.println("1. User Management");
            System.out.println("2. Receptionist Management");
            System.out.println("3. Room Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    UserManagement();
                    break;
                case 2:
                    ReceptionistManagement();
                    break;
                case 3:
                    RoomManagement();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void UserManagement() {
        System.out.println("User Management Menu:");
        System.out.println("1. User Operations");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                App.main(null); // Launch User Management
                break;
            case 2:
                return;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }
    }

    private static void ReceptionistManagement() {
        System.out.println("Receptionist Management Menu:");
        System.out.println("1. Receptionist Operations");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                ReceptionistClient.main(null); // Launch Receptionist Management
                break;
            case 2:
                return;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }
    }

    private static void RoomManagement() {
        System.out.println("Room Management Menu:");
        System.out.println("1. Room Operations");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                RoomClient.main(null); // Launch Room Management
                break;
            case 2:
                return;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }
    }
}

