package co.cstad.view;

import co.cstad.model.UserDTO;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class UserView {
    private static Scanner scanner = new Scanner(System.in);

    public static UserDTO collectNewUserInformation() {
        UserDTO newUser = new UserDTO();

        try {
            System.out.print("Enter username:");
            newUser.setUsername(scanner.nextLine());

            System.out.print("Enter password:");
            newUser.setPassword(scanner.nextLine());

            System.out.print("Enter user email:");
            newUser.setEmail(scanner.nextLine());

            System.out.print("Enter user contact:");
            newUser.setUserContact(scanner.nextLine());

            System.out.print("Enter user address:");
            newUser.setAddress(scanner.nextLine());

            System.out.print("Is the user active? (Enter 'y' for true, 'n' for false): ");
            newUser.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

            boolean validInput = false;
            do {
                try {
                    System.out.print("Enter user role (1 for admin, 2 for manager, 3 for report):");
                    String roleInput = scanner.nextLine();
                    newUser.setRoleId(Long.parseLong(roleInput));
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numeric value for the role.");
                }
            } while (!validInput);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        return newUser;
    }

    public static void printUserDetails(Collection<UserDTO> userDTOS) {
        Table table = new Table(8, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   Username   ");
        table.addCell("   Password   ");
        table.addCell("   Email   ");
        table.addCell("   User Contact   ");
        table.addCell("   Address   ");
        table.addCell("   User Status   ");
        table.addCell("   Role ID   ");
        table.addCell("   User ID   ");

        for (UserDTO userDTO : userDTOS) {
            table.addCell("   " + userDTO.getUsername() + "   ");
            table.addCell("   " + userDTO.getPassword()+ "   ");
            table.addCell("   " + userDTO.getEmail() + "   ");
            table.addCell("   " + userDTO.getUserContact() + "   ");
            table.addCell("   " + userDTO.getAddress() + "   ");
            table.addCell("   " + (userDTO.getStatus() ? "Active" : "Inactive") + "   ");
            table.addCell("   " + String.valueOf(userDTO.getRoleId()) + "   ");
            table.addCell("   " + String.valueOf(userDTO.getUserId()) + "   ");
        }

        System.out.println(table.render());
    }

    public static void printUserList(List<UserDTO> userDTOList) {
        System.out.println("User List:");
        printUserDetails(userDTOList);
    }

}