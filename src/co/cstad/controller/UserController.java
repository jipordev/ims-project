package co.cstad.controller;

import co.cstad.exception.StringInputException;
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
        System.out.print("Enter the ID of the user to delete: ");
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
    public void updateAll(){
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);
            if (existingUser != null) {
                System.out.println("Existing User Details");
                menuViewAdmin.userConfirmation(existingUser);

                UserDTO newUser = UserView.collectNewUserInformation();

                if (newUser != null) {
                    existingUser.setUsername(newUser.getUsername());
                    existingUser.setPassword(newUser.getPassword());
                    existingUser.setEmail(newUser.getEmail());
                    existingUser.setContact(newUser.getContact());
                    existingUser.setAddress(newUser.getAddress());
                    existingUser.setStatus(newUser.getStatus());
                    existingUser.setRoleId(newUser.getRoleId());

                    UserDTO updatedUser = userService.updateById(existingUser);
                    if (updatedUser != null) {
                        System.out.println("User updated successfully:");
                        menuViewAdmin.userConfirmation(updatedUser);
                    } else {
                        System.out.println("Failed to update user.");
                    }
                } else {
                    System.out.println("Invalid input for updating the user.");
                }
            } else {
                System.out.println("User with ID : "+ userId+ " not found.");
            }
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again");
        }
    }
    public void updateUsername(){
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                System.out.print("Enter the new username : ");
                String newUsername = scanner.nextLine();

                if (validateStringInput(newUsername)) {
                    existingUser.setUsername(newUsername);

                    // Call the service to update the item
                    UserDTO updatedUser = userService.updateById(existingUser);

                    if (updatedUser != null) {
                        System.out.println("Username updated successfully :");
                        menuViewAdmin.userConfirmation(updatedUser);
                    } else {
                        System.out.println("Failed to update username.");
                    }
                } else {
                    System.out.println("Invalid input for the new username");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updatePassword() {
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                // Check the old password before allowing the update
                System.out.print("Enter the old password: ");
                String oldPassword = scanner.nextLine();

                if (oldPassword.equals(existingUser.getPassword())) {
                    // Old password is correct, allow the update
                    System.out.print("Enter the new password: ");
                    String newPassword = scanner.nextLine();

                    if (validateStringInput(oldPassword) && validateStringInput(newPassword)){
                        existingUser.setPassword(newPassword);

                        // Call the service to update the user
                        UserDTO updatedUser = userService.updateById(existingUser);

                        if (updatedUser != null) {
                            System.out.println("Password updated successfully:");
                            menuViewAdmin.userConfirmation(updatedUser);
                        } else {
                            System.out.println("Failed to update password.");
                        }
                    } else {
                        System.out.println("Invalid input for updating the password.");
                    }
                } else {
                    System.out.println("Incorrect old password. Password update canceled.");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid input for the new password");
        }
    }
    public void updateEmail(){
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                System.out.print("Enter the new email : ");
                String newEmail = scanner.nextLine();

                if (validateStringInput(newEmail)) {
                    existingUser.setEmail(newEmail);

                    // Call the service to update the item
                    UserDTO updatedUser = userService.updateById(existingUser);

                    if (updatedUser != null) {
                        System.out.println("Email updated successfully :");
                        menuViewAdmin.userConfirmation(updatedUser);
                    } else {
                        System.out.println("Failed to update email.");
                    }
                } else {
                    System.out.println("Invalid input for the new email");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateContact(){
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                System.out.print("Enter the new username : ");
                String newContact = scanner.nextLine();

                if (validateStringInput(newContact)) {
                    existingUser.setContact(newContact);

                    // Call the service to update the item
                    UserDTO updatedUser = userService.updateById(existingUser);

                    if (updatedUser != null) {
                        System.out.println("Contact updated successfully :");
                        menuViewAdmin.userConfirmation(updatedUser);
                    } else {
                        System.out.println("Failed to update contact.");
                    }
                } else {
                    System.out.println("Invalid input for the new contact");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void updateAddress(){
        System.out.print("Enter the ID of the user to update: ");
        Long userId = Long.parseLong(scanner.nextLine());

        UserDTO existingUser = userService.selectById(userId);

        if (existingUser != null) {
            System.out.println("Existing User Details:");
            menuViewAdmin.userConfirmation(existingUser);

            System.out.print("Enter the new username : ");
            String newAddress = scanner.nextLine();

            if (validateStringInput(newAddress)) {
                existingUser.setAddress(newAddress);

                // Call the service to update the item
                UserDTO updatedUser = userService.updateById(existingUser);

                if (updatedUser != null) {
                    System.out.println("Address updated successfully :");
                    menuViewAdmin.userConfirmation(updatedUser);
                } else {
                    System.out.println("Failed to update address.");
                }
            } else {
                System.out.println("Invalid input for the new address");
            }
        } else {
            System.out.println("User with ID " + userId + " not found.");
        }
    }
    public void updateStatus() {
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                System.out.print("Enter the new user status (true/false): ");
                boolean newUserStatus = Boolean.parseBoolean(scanner.nextLine());

                existingUser.setStatus(newUserStatus);

                // Call the service to update the item
                UserDTO updatedUser = userService.updateById(existingUser);

                if (updatedUser != null) {
                    System.out.println("User status updated successfully:");
                    menuViewAdmin.userConfirmation(updatedUser);
                } else {
                    System.out.println("Failed to update user status.");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Ivalid ID input. Please try again.");
        }
    }
    public void updateRole(){
        try {
            System.out.print("Enter the ID of the user to update: ");
            Long userId = Long.parseLong(scanner.nextLine());

            UserDTO existingUser = userService.selectById(userId);

            if (existingUser != null) {
                System.out.println("Existing User Details:");
                menuViewAdmin.userConfirmation(existingUser);

                System.out.print("Enter the new role(1 for admin, 2 for manager, 3 for report) : ");
                long newUserRole = Long.parseLong(scanner.nextLine());

                existingUser.setRoleId(newUserRole);

                // Call the service to update the item
                UserDTO updatedUser = userService.updateById(existingUser);

                if (updatedUser != null) {
                    System.out.println("Role updated successfully :");
                    menuViewAdmin.userConfirmation(updatedUser);
                } else {
                    System.out.println("Failed to update role.");
                }
            } else {
                System.out.println("User with ID " + userId + " not found.");
            }
        } catch (StringInputException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Invalid ID input. Please try again.");
        }
    }
    public void confirmation(UserDTO createdUser) {
        menuViewAdmin.userConfirmation(createdUser);
    }
    public void closeScanner() {
        scanner.close();
    }
    private boolean validateStringInput(String input) throws StringInputException {
        if (input == null || input.trim().isEmpty()) {
            throw new StringInputException("Input cannot be null or empty.");
        }
        return true;
    }
}