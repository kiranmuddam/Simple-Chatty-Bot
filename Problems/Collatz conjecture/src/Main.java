import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        while (inputNum != 1) {
            System.out.print(inputNum + " ");
            if (inputNum % 2 == 0) {
                inputNum = inputNum / 2;
            } else if (inputNum % 2 == 1) {
                inputNum = inputNum * 3 + 1;
            }
        }
        System.out.println(1);
    }
}
