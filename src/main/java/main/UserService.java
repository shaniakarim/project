package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    private Map<String, User> users = new HashMap<>();
    private User loggedInUser;

    public void signUp(Scanner scanner) {
        System.out.println("Sign Up:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = new User(username, email, password);
        users.put(email, user);
        System.out.println("User registered successfully!");
    }

    public void login(Scanner scanner) {
        System.out.println("Log In:");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            loggedInUser = user;
            System.out.println("Logged in successfully!");
            showMainMenu(scanner);
        } else {
            System.out.println("Invalid credentials, please try again.");
        }
    }

    private void showMainMenu(Scanner scanner) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("1. View Notes");
            System.out.println("2. Add Note");
            System.out.println("3. Edit Note");
            System.out.println("4. Delete Note");
            System.out.println("5. Search Notes");
            System.out.println("6. View Profile");
            System.out.println("7. Log Out");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // View notes
                    break;
                case 2:
                    // Add note
                    break;
                case 3:
                    // Edit note
                    break;
                case 4:
                    // Delete note
                    break;
                case 5:
                    // Search notes
                    break;
                case 6:
                    // View profile
                    break;
                case 7:
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
