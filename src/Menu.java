public class Menu {
    public static void displayMenu() {
        int option;

        UIComponents.header();
        UIComponents.print(UIComponents.headerText(" Bienvenido/a " + User.getName() + " "));

        UIComponents.print("");
        UIComponents.print("1. Consultar saldo");
        UIComponents.print("2. Ingresar dinero");
        UIComponents.print("3. Sacar dinero");
        UIComponents.print("4. Ver historial de transacciones");
        UIComponents.print("5. Mi cuenta");
        UIComponents.print("6. Cerrar sesión");
        UIComponents.print("");
        UIComponents.print("Introduce el número de la operación que deseas realizar:");
        option = UIComponents.getInt();

        switch (option) {
            case 1:
                Operations.showMoney();
                break;
            case 2:
                Operations.addMoney();
                break;
            case 3:
                Operations.takeMoney();
                break;
            case 4:
                Operations.showTransactions();
                break;
            case 5:
                Operations.showAccount();
                break;
            case 6:
                Operations.logoff();
            default:
                UIComponents.print("Opción no válida");
                UIComponents.print("Presiona enter para volver al menú principal");
                UIComponents.getString();
                displayMenu();
                break;

    }

}
}


