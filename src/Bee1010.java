import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double price1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double amount = num1 * price1 + num2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", amount);

        sc.close();
    }

}
