import java.util.Locale;
import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double fuel = sc.nextDouble();

        double kml = km / fuel;

        System.out.printf("%.3f km/l%n", kml);

        sc.close();
    }

}
