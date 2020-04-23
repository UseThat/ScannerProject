import java.util.Locale;
import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Set A: ");
        double a = scan.nextDouble();
        System.out.print("Set B: ");
        double b = scan.nextDouble();
        System.out.println("What action? (+-/*)");
        scan.nextLine();
        String action = scan.nextLine();
        scan.close();
        new SwitchOption().calculation(a,b,action);

    }
}
