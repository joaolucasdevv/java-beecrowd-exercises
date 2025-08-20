import java.util.Locale;
import java.util.Scanner;

public class Bee1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a * c / 2;
        double cirulo = 3.141159 * Math.pow(c, 2);
        double trapezio = a + b * c;

        sc.close();
    }

}
