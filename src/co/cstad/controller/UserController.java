package co.cstad.controller;

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

    public void closeScanner() {
        scanner.close();
    }
}
