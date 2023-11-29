package co.cstad;

import co.cstad.view.MenuViewAdmin;

public class Main {
    public static void main(String[] args) {
        MenuViewAdmin.startInterface();

        MenuViewAdmin.menuLogin();
        MenuViewAdmin.menuLogin2();

        MenuViewAdmin.menuAboutUs();
        MenuViewAdmin.menuExit();

        MenuViewAdmin.menuItemAdmin();
        MenuViewAdmin.menuCustomerAdmin();
        MenuViewAdmin.menuInvoiceAdmin();
        MenuViewAdmin.menuUserAdmin();
        MenuViewAdmin.menuReportAdmin();

    }
}
