import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();
        if (length * width < segments) {
            System.out.println("NO");
        } else if (segments % length == 0 || segments % width == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}