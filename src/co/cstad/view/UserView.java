package co.cstad.view;

import co.cstad.model.CustomerDTO;
import co.cstad.model.ItemDTO;
import co.cstad.model.UserDTO;
import co.cstad.util.Singleton;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class UserView {
    private static Scanner scanner;
    public UserView(){
        scanner = Singleton.scanner();
    }

    public static UserDTO collectNewUserInformation() {
        UserDTO newUser = new UserDTO();

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

        System.out.print("Enter user role (1 for admin, 2 for manager, 3 for report):");
        newUser.setRoleId(Long.parseLong(scanner.nextLine()));

        System.out.print("Is the item active? (Enter 'y' for true, 'n' for false): ");
        newUser.setStatus(scanner.nextLine().equalsIgnoreCase("y"));

        return newUser;
    }

    public static void printUserDetails(Collection<UserDTO> userDTOS) {
        Table table = new Table(8, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        table.addCell("   User ID   ");
        table.addCell("   Username   ");
        table.addCell("   Password   ");
        table.addCell("   Email   ");
        table.addCell("   User Contact   ");
        table.addCell("   Address   ");
        table.addCell("   Role ID   ");
        table.addCell("   User Status   ");

        for (UserDTO userDTO : userDTOS) {
            table.addCell("   " + String.valueOf(userDTO.getUserId()) + "   ");
            table.addCell("   " + userDTO.getUsername() + "   ");
            table.addCell("   " + userDTO.getPassword()+ "   ");
            table.addCell("   " + userDTO.getEmail() + "   ");
            table.addCell("   " + userDTO.getUserContact() + "   ");
            table.addCell("   " + userDTO.getAddress() + "   ");
            table.addCell("   " + String.valueOf(userDTO.getRoleId()) + "   ");
            table.addCell("   " + (userDTO.getStatus() ? "Active" : "Inactive") + "   ");
        }

        System.out.println(table.render());
    }

    public static void printUserList(List<UserDTO> userDTOList) {
        System.out.println("User List:");
        printUserDetails(userDTOList);
    }

}