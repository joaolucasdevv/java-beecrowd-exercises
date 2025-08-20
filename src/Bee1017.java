import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int speed = sc.nextInt();

        double liters = (double) speed * time / 12.0;

        System.out.printf("%.3f%n", liters);

        sc.close();
    }

}
