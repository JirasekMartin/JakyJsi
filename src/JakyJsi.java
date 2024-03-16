import java.util.Scanner;
public class JakyJsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in,"UTF-8");
        System.out.println("Ahoj, jak se jmenuješ?");

        String Jmeno = scanner.nextLine();

        System.out.println("Jaký jsi?");

        String Vlastnost = scanner.nextLine();

        String spojit = Jmeno +  " je " + Vlastnost;


        System.out.println(spojit);

    }
}
