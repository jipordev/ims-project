package co.cstad.view;

import co.cstad.model.UserDTO;
import co.cstad.view.staticmenu.BoxBorder;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class UserView implements BoxBorder {
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
            newUser.setContact(scanner.nextLine());

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
        Table table = new Table(7, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0, 15, 25);
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.setColumnWidth(5, 20, 50);
        table.setColumnWidth(6, 20, 50);

        table.addCell(yellow + "User ID", cellStyle);
        table.addCell(yellow + "Username", cellStyle);
        table.addCell(yellow + "Role Name", cellStyle);
        table.addCell(yellow + "User Email", cellStyle);
        table.addCell(yellow + "User Contact", cellStyle);
        table.addCell(yellow + "Address", cellStyle);
        table.addCell(yellow + "User Status", cellStyle);

        for (UserDTO userDTO : userDTOS) {
            table.addCell(green + String.valueOf(userDTO.getUserId()), cellStyle);
            table.addCell(green + userDTO.getUsername(), cellStyle);
            table.addCell(green + userDTO.getRoleDTO().getRoleName() , cellStyle);
            table.addCell(green + userDTO.getEmail(), cellStyle);
            table.addCell(green + userDTO.getContact(), cellStyle);
            table.addCell(green + userDTO.getAddress(), cellStyle);
            table.addCell(green + (userDTO.getStatus() ? "Active" : "Inactive"), cellStyle);

        }

        System.out.println(table.render());
    }

    public static void printUserList(List<UserDTO> userDTOList) {
        System.out.println("User List:");
        printUserDetails(userDTOList);
    }

}