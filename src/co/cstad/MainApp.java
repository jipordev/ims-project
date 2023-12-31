// MainApp.java
package co.cstad;

import co.cstad.util.Singleton;
import co.cstad.util.handle.Handle;
import co.cstad.view.staticmenu.MenuView;


public class MainApp {
    private static MenuView menuView =new MenuView();
    private static final Handle handle = Singleton.handle();
    public static void main(String[] args) {
        menuView.startInterface();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        handle.handleLogIn();
    }
}