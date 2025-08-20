import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {

   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       String name = sc.nextLine();
       double salary = sc.nextDouble();
       double sales = sc.nextDouble();

       double percent = 15 * sales / 100;
       salary += percent;

       System.out.printf("TOTAL = R$ %.2f%n", salary);

       sc.close();
   }

}
