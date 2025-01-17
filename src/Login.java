import java.util.Objects;

public class Login {

    public static boolean Login() {
        String email;
        String password;

        UIComponents.header();
        UIComponents.print("Introduce tu email:");
        email = UIComponents.getString();
        UIComponents.print("");
        UIComponents.print("Introduce tu contraseña:");
        password = UIComponents.getString();
        UIComponents.print("");

        if (Objects.equals(email, User.getEmail()) && Objects.equals(password, User.getPassword())) {
            return true;
        } else {
            UIComponents.print("Email o contraseña incorrectos");
            return false;
        }


    }

}
