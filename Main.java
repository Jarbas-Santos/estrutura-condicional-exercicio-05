import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double totalPrice;

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        if (code == 1) {
            totalPrice = quantity * 4.0;
        }
        else if (code == 2) {
            totalPrice = quantity * 4.5;
        }
        else if (code == 3) {
            totalPrice = quantity * 5.0;
        }
        else if (code == 4) {
            totalPrice = quantity * 2.0;
        }
        else {
            totalPrice = quantity * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", totalPrice);

        sc.close();
    }
}