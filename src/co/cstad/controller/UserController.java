package co.cstad.controller;

import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;
import co.cstad.service.UserService;
import co.cstad.util.Singleton;
import co.cstad.view.MenuViewAdmin;
import co.cstad.view.UserView;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private final MenuViewAdmin menuViewAdmin;
    private final UserService userService;
    private final Scanner scanner;

    public UserController() {
        scanner = Singleton.scanner();
        userService = Singleton.userService();
        menuViewAdmin = Singleton.menuViewAdmin();
    }

    public void read() {
        List<UserDTO> userDTOList = userService.select();
        UserView.printUserList(userDTOList);
    }
    public UserDTO create(){
        UserDTO newUser = UserView.collectNewUserInformation();
        if (newUser != null) {
            UserDTO createdUser = userService.insert(newUser);

            if (createdUser != null) {
                System.out.println("User created successfully:");
                return createdUser;
            } else {
                System.out.println("Failed to create user.");
            }
        } else {
            System.out.println("Invalid input for creating a new user.");
        }
        return null;
    }
    public UserDTO delete() {
        System.out.print("Enter the ID of the item to delete: ");
        Long userId = Long.parseLong(scanner.nextLine());

        UserDTO userToDelete = userService.selectById(userId);

        if (userToDelete != null) {
            System.out.println("Confirmation before deletion.");
            menuViewAdmin.userConfirmation(userToDelete);
            System.out.print("Do you want to proceed with the deletion? (yes/no): ");
            String confirmation = scanner.nextLine().toLowerCase();

            if (confirmation.equals("yes")) {
                UserDTO deletedUser = userService.deleteById(userId);

                if (deletedUser != null) {
                    System.out.println("User deleted successfully:");
                    return deletedUser;
                } else {
                    System.out.println("Failed to delete user.");
                }
            } else {
                System.out.println("Deletion canceled by user.");
            }
        } else {
            System.out.println("Item with ID " + userId + " not found.");
        }

        return null;
    }
    public void confirmation(UserDTO createdUser) {
        menuViewAdmin.userConfirmation(createdUser);
    }
    public void closeScanner() {
        scanner.close();
    }
}