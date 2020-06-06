import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsCount = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend) {
            boolean result = cupsCount >= 15 && cupsCount <= 25;
            System.out.println(result);
        } else {
            boolean result = cupsCount >= 10 && cupsCount <= 20;
            System.out.println(result);
        }
    }
}
