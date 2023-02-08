import java.util.Locale;
import java.util.Scanner;

public class MenuUsingSwitchCase {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalPrice = 0.0;

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        switch (code) {
            case 1:
            totalPrice = quantity * 4.0;
            break;

            case 2:
            totalPrice = quantity * 4.5;
            break;

            case 3:
            totalPrice = quantity * 5.0;
            break;

            case 4:
            totalPrice = quantity * 2.0;
            break;

            case 5:
            totalPrice = quantity * 1.5;
            break;
        }

        System.out.printf("Total: R$ %.2f%n", totalPrice);

        sc.close();
    }
}