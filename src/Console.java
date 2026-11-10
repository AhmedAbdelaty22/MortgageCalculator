import java.util.Scanner;

public class Console {

    private static final Scanner sc = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max) {
        double value;

        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Please Enter a Value Between " + min + " and " + max);
        }
        return value;
    }
}