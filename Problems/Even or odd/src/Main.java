import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        while (currentNumber != 0) {
            if (currentNumber % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            currentNumber = scanner.nextInt();
        }
    }
}