package main;

import java.util.Scanner;

public class UserProfileService {
    public void viewProfile(User user) {
        System.out.println("User Profile:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
    }

    public void editProfile(Scanner scanner, User user) {
        System.out.println("Edit Profile:");
        System.out.print("New Username: ");
        String username = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        System.out.print("New Password: ");
        String password = scanner.nextLine();

        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        System.out.println("Profile updated successfully!");
    }
}
