import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int currentNum = scanner.nextInt();
        while (currentNum != 0) {
            totalSum = totalSum + currentNum;
            currentNum = scanner.nextInt();
        }
        System.out.println(totalSum);
    }
}