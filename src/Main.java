import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loginResults;
        // Add some example transactions for the object
        User.createUser(1,"Maria","Jimenez","maria.jimenez@gmail.com","1234",1000,0.01f,0,0,200, new Object[10]);

        loginResults = Login.Login();

        if (loginResults) {
            Menu.displayMenu();
        } else {
            UIComponents.print("Presiona enter para volver a intentarlo");
            UIComponents.getString();
            main(null);
        }

    }

}
