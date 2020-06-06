import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int totalSum = 0;
        while (scanner.hasNext()) {
            totalSum = totalSum + currentNumber;
            if (currentNumber == 0) {
                System.out.println(totalSum);
                break;
            } else if (totalSum >= 1000) {
                System.out.println(totalSum - 1000);
                break;
            }
            currentNumber = scanner.nextInt();
        }
    }
}