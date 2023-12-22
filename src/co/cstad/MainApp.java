// MainApp.java
package co.cstad;

import co.cstad.util.Singleton;
import co.cstad.util.handle.Handle;

public class MainApp {
    private static final Handle handle = Singleton.handle();
    public static void main(String[] args) {
        //menuView.startInterface();
        handle.handleLogIn();
    }
}
