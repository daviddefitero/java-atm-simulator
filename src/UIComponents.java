import java.util.Scanner;


public class UIComponents {
    public static void header() {
        clearScreen();
        separator();
        print(headerText(" CaixaBank ATM "));
        separator();
        print("");
        print("");
        print("");
    }

    public static void separator() {
        print("===========================================================");
    }

    public static String headerText(String text) {
        int totalLength = 60;
        int paddingLength = (totalLength - text.length()) / 2;
        String padding = "-".repeat(paddingLength);
        return padding + text + padding;
    }


    public static void print(String argument) {
        System.out.println(argument);
    }

    public static String getString() {
        Scanner reader = new Scanner(System.in);
        String n = reader.nextLine();
        return n;
    }

    public static int getInt() {
        String n = getString();
        if (!n.matches("[0-9]+")) {
            print("Por favor, introduce un número");
            return getInt();
        }
        int num = Integer.parseInt(n);
        return num;
    }

    public static float getFloat() {
        String n = getString();
        if (!n.matches("[0-9]+")) {
            print("Por favor, introduce un número");
            return getFloat();
        }
        float num = Float.parseFloat(n);
        return num;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }



}
