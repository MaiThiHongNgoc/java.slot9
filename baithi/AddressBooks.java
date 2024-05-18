package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        boolean exit = false;

        // Loop until the user chooses to exit
        while (!exit) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Option 1: Add new contact
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    contacts.add(new Contact(name, company, email, phone));
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    // Option 2: Find a contact by name
                    System.out.print("Enter Name to find: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Contact contact : contacts) {
                        if (contact.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Phone: " + contact.getPhone());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;

                case 3:
                    // Option 3: Display contacts
                    System.out.println("\nContacts List:");
                    for (Contact contact : contacts) {
                        System.out.println(contact);
                    }
                    break;

                case 4:
                    // Option 4: Exit
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        scanner.close();
    }
}
