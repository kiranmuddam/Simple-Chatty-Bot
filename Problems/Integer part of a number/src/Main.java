import java.util.Scanner;

public class Main {

    public static int extractInt(double d) {
        int extractedInt = (int) d;
        return extractedInt;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}