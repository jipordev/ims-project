package co.cstad.util;

import java.util.Scanner;

public class Singleton {
    private static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static String inputValue(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }
}
