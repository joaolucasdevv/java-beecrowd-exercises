import java.util.Locale;
import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        int year = days / 365;
        int resto = days % 365;

        int month = resto / 12;
        resto = resto % 12;

        int daysMonth = resto;

        System.out.println(year + " ano(s)");
        System.out.println(month + " ");




        sc.close();
    }

}
