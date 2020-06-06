import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        inputString = inputString.replace('a', 'b');
        System.out.println(inputString);
    }
}