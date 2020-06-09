import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prevNumber = scanner.nextInt();
        int currentNumber = scanner.nextInt();
        int ascending = -1;
        boolean isOrdered = true;
        while (currentNumber != 0) {
            if (prevNumber == currentNumber) {
            } else if (prevNumber > currentNumber && (ascending == -1 || ascending == 1)) {
                ascending = 1;
            } else if (prevNumber < currentNumber && (ascending == -1 || ascending == 0)) {
                ascending = 0;
            } else {
                isOrdered = false;
                break;
            }
            prevNumber = currentNumber;
            currentNumber = scanner.nextInt();
        }
        System.out.println(isOrdered);
    }
}
