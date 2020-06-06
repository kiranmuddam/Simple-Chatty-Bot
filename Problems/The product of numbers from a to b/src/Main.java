import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeStart = scanner.nextInt();
        int rangeEnd = scanner.nextInt();
        long totalProduct = 1;
        for (int i = rangeStart; i < rangeEnd; ++i) {
            totalProduct = totalProduct * i;
        }
        System.out.println(totalProduct);
    }
}