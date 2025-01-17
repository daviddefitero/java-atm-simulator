public class Operations {
    public static void showMoney() {

        UIComponents.header();
        UIComponents.print("Tu saldo actual es de: " + User.getBalance());
        UIComponents.print("");
        UIComponents.print("Presiona enter para volver al menú principal");
        UIComponents.getString();

        Menu.displayMenu();

    }

    public static void addMoney() {
        float amount;
        UIComponents.header();
        UIComponents.print("Introduce la cantidad que deseas ingresar:");
        amount = UIComponents.getFloat();
        User.addBalance(amount);
        User.addTransaction("Ingreso", amount);
        UIComponents.print("Ingreso realizado con éxito");
        UIComponents.print("");
        UIComponents.print("Presiona enter para volver al menú principal");
        UIComponents.getString();

        Menu.displayMenu();
    }

    public static void takeMoney() {
        float amount;
        UIComponents.header();
        UIComponents.print("Introduce la cantidad que deseas retirar");
        amount = UIComponents.getFloat();
        if (amount > User.getWithdrawalLimit()) {
            UIComponents.print("La cantidad introducida supera el límite de retirada");
            UIComponents.print("");
            UIComponents.print("Presiona enter para volver al menú principal");
            UIComponents.getString();
            Menu.displayMenu();
        } else if (amount > User.getBalance()) {
            UIComponents.print("No tienes suficiente saldo");
            UIComponents.print("");
            UIComponents.print("Presiona enter para volver al menú principal");
            UIComponents.getString();
            Menu.displayMenu();
        } else {
            User.removeBalance(amount);
            User.addTransaction("Retirada", amount);
            UIComponents.print("Retirada realizada con éxito");
            UIComponents.print("");
            UIComponents.print("Presiona enter para volver al menú principal");
            UIComponents.getString();
        }

        Menu.displayMenu();
    }

    public static void showTransactions(){
        UIComponents.header();
        UIComponents.print("Historial de transacciones");
        UIComponents.print("");
        for (Object transaction : User.getTransactions()) {
            if (transaction != null) {
                UIComponents.print(transaction.toString());
            }
        }
        UIComponents.print("");
        UIComponents.print("Presiona enter para volver al menú principal");
        UIComponents.getString();

        Menu.displayMenu();
    }

    public static void showAccount(){
        UIComponents.header();
        UIComponents.print("Nombre: " + User.getName());
        UIComponents.print("Apellidos: " + User.getSurname());
        UIComponents.print("Email: " + User.getEmail());
        UIComponents.print("Saldo: " + User.getBalance());
        UIComponents.print("Interés: " + User.getInterestRate());
        UIComponents.print("Intereses generados: " + User.getInterest());
        UIComponents.print("Saldo total: " + User.getTotalBalance());
        UIComponents.print("Límite de retirada: " + User.getWithdrawalLimit());
        UIComponents.print("");
        UIComponents.print("Desea editar su cuenta?");
        UIComponents.print("1. Sí");
        UIComponents.print("2. No");
        int option = UIComponents.getInt();
        if (option == 1) {
            UIComponents.header();
            UIComponents.print("Introduce tu nombre o presiona enter para no modificarlo: (nombre actual: " + User.getName() + ")");
            if (!UIComponents.getString().isEmpty()) {
                User.setName(UIComponents.getString());
                UIComponents.print("Nombre editado con éxito. Saludos " + User.getName() + " " + User.getSurname());
                UIComponents.print("");
            } else {
                UIComponents.print("Nombre no modificado");
                UIComponents.print("");
            }
            UIComponents.print("Introduce tus apellidos o presiona enter para no modificarlo: (apellidos actuales: " + User.getSurname() + ")");
            if (!UIComponents.getString().isEmpty()) {
                User.setSurname(UIComponents.getString());
                UIComponents.print("Apellidos editados con éxito. Saludos " + User.getName() + " " + User.getSurname());
                UIComponents.print("");
            } else {
                UIComponents.print("Apellidos no modificados");
                UIComponents.print("");
            }
            UIComponents.print("Introduce tu email o presiona enter para no modificarlo: (email actual: " + User.getEmail() + ")");
            if (!UIComponents.getString().isEmpty()) {
                User.setEmail(UIComponents.getString());
                UIComponents.print("Email editado con éxito. Tu correo es ahora " + User.getEmail());
                UIComponents.print("");
            } else {
                UIComponents.print("Email no modificado");
                UIComponents.print("");
            }
            UIComponents.print("Introduce tu contraseña o presiona enter para no modificarla: (contraseña actual: " + User.getPassword() + ")");
            if (!UIComponents.getString().isEmpty()) {
                User.setPassword(UIComponents.getString());
                UIComponents.print("Contraseña editada con éxito");
                UIComponents.print("");
            } else {
                UIComponents.print("Contraseña no modificada");
                UIComponents.print("");
            }
            UIComponents.print("Introduce tu limite de retirada o presiona enter para no modificarlo: (límite actual: " + User.getWithdrawalLimit() + ")");
            if (!UIComponents.getString().isEmpty()) {
                User.setWithdrawalLimit(UIComponents.getFloat());
                UIComponents.print("Límite de retirada editado con éxito");
                UIComponents.print("");
            } else {
                UIComponents.print("Límite de retirada no modificado");
                UIComponents.print("");
            }
            UIComponents.print("");
            UIComponents.print("Cuenta editada con éxito");
            UIComponents.print("");
            UIComponents.print("Presiona enter para ver tus datos");
            UIComponents.getString();
            showAccount();
        } else {
            UIComponents.print("");
            UIComponents.print("Presiona enter para volver al menú principal");
            UIComponents.getString();
        }

        Menu.displayMenu();
    }

    public static void logoff(){
        UIComponents.clearScreen();
        UIComponents.header();
        UIComponents.print("Gracias por usar CaixaBank ATM");
        Main.main(null);
    }
}
