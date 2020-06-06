import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limitNumber = scanner.nextInt();
        int i = 1;
        while (i * i <= limitNumber) {
            long number = i * i;
            System.out.println(number);
            ++i;
        }
    }
}