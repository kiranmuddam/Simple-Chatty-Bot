import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int recommended = scanner.nextInt();
        int excess = scanner.nextInt();
        int dailySleepHours = scanner.nextInt();
        if (dailySleepHours < recommended) {
            System.out.println("Deficiency");
        } else if (dailySleepHours >= recommended && dailySleepHours <= excess) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
    }
}