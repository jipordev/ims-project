package co.cstad.util;

import co.cstad.controller.CustomerController;
import co.cstad.controller.ItemController;
import co.cstad.controller.UserController;
import co.cstad.dao.ItemDaoImpl;
import co.cstad.dao.UserDaoImpl;
import co.cstad.service.ItemService;
import co.cstad.service.ItemServiceImpl;
import co.cstad.service.UserService;
import co.cstad.service.UserServiceImpl;
import co.cstad.view.MenuViewAdmin;

import java.util.Scanner;

public class Singleton {
    private static Singleton instance = null;
    private static Scanner scanner;
    private static ItemController itemController;
    private static ItemService itemService;
    private static ItemDaoImpl itemDao;
    private static UserController userController;
    private static UserService userService;
    private static UserDaoImpl userDao;
    private static CustomerController customerController;
    private static MenuViewAdmin menuViewAdmin;
    public static UserController userController(){
        if (userController == null) {
            userController = new UserController();
        }
        return userController;
    }
    public static UserDaoImpl getUserDao(){
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }
    public static UserService userService(){
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }
    public static Scanner scanner(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static ItemDaoImpl getItemDao(){
        if (itemDao == null) {
            itemDao = new ItemDaoImpl();
        }
        return itemDao;
    }
    public static MenuViewAdmin menuViewAdmin(){
        if (menuViewAdmin == null) {
            menuViewAdmin = new MenuViewAdmin();
        }
        return menuViewAdmin;
    }
    public static ItemService itemService() {
        if (itemService == null) {
            itemService = new ItemServiceImpl();
        }
        return itemService;
    }
    public static CustomerController customerController() {
        if (customerController == null) {
            customerController = new CustomerController();
        }
        return customerController;
    }
    public static ItemController itemController() {
        if (itemController == null) {
            itemController = new ItemController();
        }
        return itemController;
    }
    private Singleton() {
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
