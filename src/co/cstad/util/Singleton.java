package co.cstad.util;

import co.cstad.controller.ItemController;

public class Singleton {
    private static Singleton instance = null;
    private static ItemController itemController;
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
