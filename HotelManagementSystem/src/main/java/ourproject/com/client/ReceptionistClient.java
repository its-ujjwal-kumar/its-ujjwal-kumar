package ourproject.com.client;

import java.util.Scanner;
import ourproject.com.model.Receptionist;
import ourproject.com.service.ReceptionistService;
import ourproject.com.serviceimpl.ReceptionistServiceImpl;

public class ReceptionistClient {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ReceptionistService receptionistService = new ReceptionistServiceImpl();

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create Receptionist");
            System.out.println("2. Read Receptionist");
            System.out.println("3. Update Receptionist");
            System.out.println("4. Delete Receptionist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    createReceptionist();
                    break;
                case 2:
                    readReceptionist();
                    break;
                case 3:
                    updateReceptionist();
                    break;
                case 4:
                    deleteReceptionist();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    private static void createReceptionist() {
        System.out.print("Enter receptionist ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter receptionist name: ");
        String name = scanner.nextLine();
        System.out.print("Enter receptionist phone number: ");
        String phone = scanner.nextLine();
        
        Receptionist receptionist = new Receptionist(id, name, phone);
        receptionistService.createReceptionist(receptionist);
        System.out.println("Receptionist created successfully!");
        System.out.println("Inserted receptionist details: " + receptionist);
    }

    private static void readReceptionist() {
        System.out.print("Enter receptionist ID to read details: ");
        int receptionistId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        Receptionist receptionist = receptionistService.getReceptionist(receptionistId);
        if (receptionist != null) {
            System.out.println("Receptionist details:");
            System.out.println("ID: " + receptionist.getReceptionistid());
            System.out.println("Name: " + receptionist.getName());
            System.out.println("Phone: " + receptionist.getPhone());
        } else {
            System.out.println("Receptionist with ID " + receptionistId + " not found.");
        }
    }

    private static void updateReceptionist() {
        System.out.print("Enter receptionist ID to update details: ");
        int receptionistId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        Receptionist existingReceptionist = receptionistService.getReceptionist(receptionistId);
        if (existingReceptionist != null) {
            System.out.println("Enter new details:");
            System.out.print("Name: ");
            String newName = scanner.nextLine();
            System.out.print("Phone: ");
            String newPhone = scanner.nextLine();
            
            existingReceptionist.setName(newName);
            existingReceptionist.setPhone(newPhone);
            
            receptionistService.updateReceptionist(receptionistId, existingReceptionist);
            System.out.println("Receptionist details updated successfully!");
        } else {
            System.out.println("Receptionist with ID " + receptionistId + " not found.");
        }
    }

    private static void deleteReceptionist() {
        System.out.print("Enter receptionist ID to delete: ");
        int receptionistId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        String result = receptionistService.deleteReceptionist(receptionistId);
        System.out.println(result);
    }
}

